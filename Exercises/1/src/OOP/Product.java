package OOP;

import java.lang.reflect.Constructor;

public class Product {
     private String productName;
     private int productPrice;
     private int productQuantity;

    public Product(String name, int price, int quantity) {
       if (price < 0 || quantity < 0) {
        this.productPrice = 1;
        this.productQuantity = 1;
       }
         this.productName = name;
    }


    public Product(String name) {
        this(name, 1, 1);
    }

    public String toString() {
        return "Product name: " + productName + "\n" +
                "Product price: " + productPrice + "\n" +
                "Product quantity: " + productQuantity + "\n";
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(int productPrice) {
        if (productPrice < 0) {
            this.productPrice = 1;
        } else {
            this.productPrice = productPrice;
        }
    }

    public void setProductQuantity(int productQuantity) {
        if (productQuantity < 0) {
            this.productQuantity = 1;
        } else {
            this.productQuantity = productQuantity;
        }
    }



    

    
}

class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 2, 3);
        System.out.println(product1.getProductName());
        System.out.println(product1.getProductPrice());
        System.out.println(product1.getProductQuantity());
        product1.setProductName("Bread");
        product1.setProductPrice(3);
        product1.setProductQuantity(4);
        System.out.println(product1.getProductName());
        System.out.println(product1.getProductPrice());
        System.out.println(product1.getProductQuantity());
        Product product2 = new Product("Butter");
        System.out.println(product2.getProductName());
        System.out.println(product2.getProductPrice());
        System.out.println(product2.getProductQuantity());
        product2.setProductName("Cheese");
        product2.setProductPrice(5);
        product2.setProductQuantity(6);
        System.out.println(product2.getProductName());
        System.out.println(product2.getProductPrice());
        System.out.println(product2.getProductQuantity());
    }
}
