package amt.test1.oliveira.amttest1oliveira.doa;


import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

@Stateless
public class DemandDAO implements DemandDAORemote, DemandDAOLocal{

    @Resource(name = "jdbc/AMTtest1DS")
    private DataSource dataSource;

    @Override
    public void insertDemand(int idProduct, int quantity) {

    }
}
