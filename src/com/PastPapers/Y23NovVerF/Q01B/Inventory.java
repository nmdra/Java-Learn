package PastPapers.Y23NovVerF.Q01B;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Inventory {
    HashMap<String,Product> products = new HashMap<>();

    public void addProduct(String productCode,String productName,int quantity,double price){
        Product pr = new Product(productName,quantity,price);

        products.put(productCode,pr);

    }

    public void removeProduct(String productCode){
        products.remove(productCode);
    }

    public void displayProducts(){

        Set<Map.Entry<String , Product>> set = products.entrySet();

        for(Map.Entry<String,Product> me: set) {
            System.out.println("Product Code: "+me.getKey());
            me.getValue().display();
            System.out.println();
        }
    }

    public void displayProducts2(){
        for(Map.Entry<String,Product> me: products.entrySet()){
            System.out.println("Product Code: "+me.getKey());
            me.getValue().display();
            System.out.println();
        }
    }
}
