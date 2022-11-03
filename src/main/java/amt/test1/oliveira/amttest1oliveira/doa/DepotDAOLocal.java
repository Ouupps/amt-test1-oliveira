package amt.test1.oliveira.amttest1oliveira.doa;

import amt.test1.oliveira.amttest1oliveira.buisness.Depot;

import javax.ejb.Local;
import java.util.List;

@Local
public interface DepotDAOLocal {
    List<Depot> getDepots();
}
