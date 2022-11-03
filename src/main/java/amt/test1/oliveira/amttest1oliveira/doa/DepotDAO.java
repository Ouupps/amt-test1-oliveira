package amt.test1.oliveira.amttest1oliveira.doa;

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
public class DepotDAO implements DepotDAORemote, DepotDAOLocal{

    @Resource(name = "jdbc/AMTtest1DS")
    private DataSource dataSource;

    @Override
    public List<Depot> getDepots() {
        List<Depot> list = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT * FROM depots"
            );
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                list.add(this.instantiate(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    private Depot instantiate(ResultSet rs) throws SQLException {
        return new Depot(rs.getString("depName"));
    }
}
