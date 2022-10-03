package uz.pdp.olchaProject.model;

import java.util.ArrayList;
import java.util.List;

public class Category extends Base {


    public List<Product> productList = new ArrayList<>();

    private int parentCategoryID;

    public int getParentCategoryID() {
        return parentCategoryID;
    }

    public void setParentCategoryID(int parentCategoryID) {
        this.parentCategoryID = parentCategoryID;
    }


    @Override
    public String toString() {
        return "Category{" +
                "parentCategoryID=" + parentCategoryID +
                "} " + super.toString();
    }
}
