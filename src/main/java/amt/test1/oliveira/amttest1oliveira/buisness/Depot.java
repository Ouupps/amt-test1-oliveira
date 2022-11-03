package amt.test1.oliveira.amttest1oliveira.buisness;

import java.io.Serializable;

public class Depot implements Serializable {

    private String name;

    public Depot(){}

    public Depot(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
