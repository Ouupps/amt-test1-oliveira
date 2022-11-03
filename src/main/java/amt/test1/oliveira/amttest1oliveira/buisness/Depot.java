package amt.test1.oliveira.amttest1oliveira.buisness;

import java.io.Serializable;

public class Depot implements Serializable {

    private String name;
    private int id;

    public Depot(){}

    public Depot(String name, int id){
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
}
