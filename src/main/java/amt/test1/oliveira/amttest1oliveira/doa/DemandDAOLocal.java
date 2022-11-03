package amt.test1.oliveira.amttest1oliveira.doa;


import amt.test1.oliveira.amttest1oliveira.buisness.Demand;

import javax.ejb.Local;
import java.util.List;

@Local
public interface DemandDAOLocal {

    public void insertDemand(int idDepod, int idProduct, int quantity);
    public List<Demand> getDemand(int idProduct, int idDepot);
}
