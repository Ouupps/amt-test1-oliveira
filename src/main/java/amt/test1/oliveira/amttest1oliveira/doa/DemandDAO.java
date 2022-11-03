package amt.test1.oliveira.amttest1oliveira.doa;

import amt.test1.oliveira.amttest1oliveira.buisness.Demand;
import amt.test1.oliveira.amttest1oliveira.buisness.Depot;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class DemandDAO implements DemandDAORemote, DemandDAOLocal{

    @Resource(name = "jdbc/AMTtest1DS")
    private DataSource dataSource;

    @Override
    public void insertDemand(int idProduct, int idDepot, int quantity) {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(
                    "insert into demandes values (?,?,?);"
            );
            stmt.setInt(1, idProduct);
            stmt.setInt(2, idDepot);
            stmt.setInt(3, quantity);
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Demand> getDemand(int idProduct, int idDepot){
        List<Demand> list = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(
                    "select prodName,depName,quantite from demandes\n" +
                            "  inner join produits on produits.prodNumber=?\n" +
                            "  inner join depots on depots.depNumber=?; "
            );

            stmt.setInt(1, idProduct);
            stmt.setInt(2, idDepot);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                list.add(new Demand());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
