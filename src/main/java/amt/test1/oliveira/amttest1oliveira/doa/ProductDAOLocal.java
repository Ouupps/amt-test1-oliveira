package amt.test1.oliveira.amttest1oliveira.doa;

import amt.test1.oliveira.amttest1oliveira.buisness.Product;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ProductDAOLocal {
    List<Product> getProductsStock(int isStock);
}
