package programmer.aplication;

import programmer.data.*; //untuk semua clas
import programmer.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("laptop", 10_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

    }
}
