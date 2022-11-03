package amt.test1.oliveira.amttest1oliveira.doa;

import javax.ejb.Local;

@Local
public interface DemandDAOLocal {

    void insertDemand(int idProduct, int quantity);
}
