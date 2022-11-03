package amt.test1.oliveira.amttest1oliveira.buisness;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private int id;

    private int stock;

    private int demands;

    public Product(){}

    public Product(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDemands() {
        return demands;
    }

    public void setDemands(int demands) {
        this.demands = demands;
    }
}
