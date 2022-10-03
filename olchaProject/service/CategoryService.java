package uz.pdp.olchaProject.service;

import uz.pdp.olchaProject.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    public List<Category> categories = new ArrayList<>();

    public void addCategory(String nameCategory, int parentCategoryID){
        Category category = new Category();
        category.setName(nameCategory);
        category.setParentCategoryID(parentCategoryID);
        categories.add(category);
    }

    public boolean deleteCategory(int categoryID){
        for (Category category : categories) {
            if(category!=null){
                if(category.getId()==categoryID){
                    categories.remove(category);
                    return true;
                }
            }
        }
        return false;
    }

    public Category getCategoryByID(int categoryId){
        for (Category category : categories) {
            if(category!=null){
                if(category.getId()==categoryId){
                    return category;
                }
            }
        }
        return null;
    }

}
