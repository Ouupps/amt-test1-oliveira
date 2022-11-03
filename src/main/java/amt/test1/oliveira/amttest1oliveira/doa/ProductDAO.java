package amt.test1.oliveira.amttest1oliveira.doa;

import amt.test1.oliveira.amttest1oliveira.buisness.Depot;
import amt.test1.oliveira.amttest1oliveira.buisness.Product;

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
public class ProductDAO implements ProductDAOLocal, ProductDAORemote {

    @Resource(name = "jdbc/AMTtest1DS")
    private DataSource dataSource;

    @Override
    public List<Product> getProductsStock(int isStock) {
        List<Product> list = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT * FROM produits"
            );
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                list.add(this.instantiate(rs));
            }

            for (Product product : list) {
                stmt = connection.prepareStatement(
                        "select prodName,depName,quantite from stocks\n" +
                                "  inner join produits on produits.prodNumber=?\n" +
                                "  inner join depots on depots.depNumber=?;"
                );

                stmt.setInt(1, product.getId());
                stmt.setInt(2, isStock);

                stmt.execute();
                ResultSet innerRs = stmt.getResultSet();
                product.setStock(innerRs.getInt("quantite"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    private Product instantiate(ResultSet rs) throws SQLException {
        return new Product(rs.getString("prodName"), rs.getInt("prodNumber"));
    }
}
