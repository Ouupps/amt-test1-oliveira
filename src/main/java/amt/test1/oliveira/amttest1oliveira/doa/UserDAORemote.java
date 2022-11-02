package amt.test1.oliveira.amttest1oliveira.doa;


import amt.test1.oliveira.amttest1oliveira.buisness.User;

import javax.ejb.Remote;

@Remote
public interface UserDAORemote {
    boolean createTable();
    boolean insert(User user);
}
