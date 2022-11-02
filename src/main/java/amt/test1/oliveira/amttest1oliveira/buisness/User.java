package amt.test1.oliveira.amttest1oliveira.buisness;

import java.io.Serializable;

public class User implements Serializable {
    private String lastname;
    private String firstname;

    public User(){}
    public User(String fname, String lname){
        this.firstname = fname;
        this.lastname = lname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
