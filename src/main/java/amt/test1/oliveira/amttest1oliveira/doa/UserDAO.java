package amt.test1.oliveira.amttest1oliveira.doa;

import amt.test1.oliveira.amttest1oliveira.buisness.User;

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
public class UserDAO implements UserDAOLocal, UserDAORemote {

    @Resource(lookup = "java:AppDB")
    private DataSource dataSource;

    public boolean createTable(){
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(
                    "CREATE TABLE user\n" +
                            "(\n" +
                            "    id           INT UNSIGNED        NOT NULL AUTO_INCREMENT,\n" +
                            "    firstName VARCHAR(255) UNIQUE NOT NULL,\n" +
                            "    lastName     VARCHAR(255) UNIQUE NOT NULL,\n" +
                            "    PRIMARY KEY (id)\n" +
                            ");"
            );
            return stmt.executeUpdate() == 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insert(User user) {
        System.out.println("test");
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO user (firstname, lastname) VALUES (?,?);"
            );
            stmt.setString(1, user.getLastname());
            stmt.setString(2, user.getFirstname());
            int ret = stmt.executeUpdate();
            return ret == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<User> getUsers(){
        List<User> list = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(
                "SELECT * FROM user"
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

    private User instantiate(ResultSet rs) throws SQLException {
        return new User(rs.getString("firstname"), rs.getString("lastname"));
    }

}