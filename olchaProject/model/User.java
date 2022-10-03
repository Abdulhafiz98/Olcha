package uz.pdp.olchaProject.model;

import java.util.ArrayList;
import java.util.List;

public class User extends Base {

    private String password;
    private boolean isAdmin;
    private String phoneNumber;

    public List<Product> bin = new ArrayList<>();



    public boolean isAdmin() {
        return isAdmin;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber_7rooms) {
        this.phoneNumber = phoneNumber_7rooms;
    }

}
