package uz.pdp.olchaProject.service;

import uz.pdp.olchaProject.model.Category;
import uz.pdp.olchaProject.model.Product;


public class ProductService {
    public Product addProduct(String productName, int price,int categoryID,CategoryService categoryService,int quantity){
        Product product = new Product();
        product.setName(productName);
        product.setPrice(price);
        product.setQuantity(quantity);

        for (Category category : categoryService.categories) {
            if(category!=null){
                if(category.getId()==categoryID){
                    category.productList.add(product);
                    return product;
                }
            }
        }
        return null;
    }

    public Product increaseQuantityOfProduct(Product product,int quantity){
        product.setQuantity(quantity);
        product.setPrice((1+quantity)*product.getPrice());

        return product;
    }

    public void setProductToSold(Product product){
        product.setSaleState(true);
    }
}
