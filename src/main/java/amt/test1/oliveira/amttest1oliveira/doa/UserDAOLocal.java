package amt.test1.oliveira.amttest1oliveira.doa;

import amt.test1.oliveira.amttest1oliveira.buisness.User;
import javax.ejb.Local;
import java.util.List;

@Local
public interface UserDAOLocal {
    boolean createTable();
    boolean insert(User user);

    List<User> getUsers();
}
