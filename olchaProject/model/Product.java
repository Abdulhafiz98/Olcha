package uz.pdp.olchaProject.model;

import java.math.BigDecimal;

public class Product extends Base {

    private User soldByUser;

    public User getSoldByUser() {
        return soldByUser;
    }

    public void setSoldByUser(User soldByUser) {
        this.soldByUser = soldByUser;
    }
    private int price;
    private boolean saleState;
    private int quantity;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public boolean isSaleState() {
        return saleState;
    }

    public void setSaleState(boolean saleState) {
        this.saleState = saleState;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +"Id="+getId()+
                ", name=" + getName() +
                ", price=" + price + '\'' +
                '}';
    }
    public String toStringSold(){
        return "Product{" +"Id="+getId()+
                ", price=" + price +", soldBy =>"+" Name="+soldByUser.getName()+", Phone_Number="+soldByUser.getPhoneNumber()+
                ", nameOfProduct='" + getName() + '\'' +
                '}';
    }
}
