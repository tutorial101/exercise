package exercise;

import java.util.List;
import java.util.ArrayList;


class SalesOrder {
    
    Customer customer;
    List<SalesOrderLine> lines;
    
    public static int MAX_LINES = 3;
    
    public SalesOrder(Customer customer) {
        this.customer = customer;
        this.lines    = new ArrayList<SalesOrderLine>();
    }
    
    public void add(Product product, int price, int count) {
        if (this.lines.size() >= MAX_LINES) {
            throw new RuntimeException("You can order max 3 products at a time.");
        }
        SalesOrderLine line = new SalesOrderLine(product, price, count);
        this.lines.add(line);
    }
    
    public int totalPrice() {
        int total = 0;
        for (SalesOrderLine line: this.lines) {
            total += line.totalPrice();
        }
        return total;
    }

    public void submit() {
        System.out.println("Customer: " + this.customer.name);
        System.out.println("Lines:");
        for (SalesOrderLine line: this.lines) {
            System.out.println("  - " + line.product.name + " : \\" + line.price + " * " + line.count);
        }
        System.out.println("Total: " + this.totalPrice());
    }
    
}

class SalesOrderLine {
    
    Product product;
    int     price;
    int     count;
    
    public SalesOrderLine(Product product, int price, int count) {
        this.product = product;
        this.price   = price;
        this.count   = count;
    }
    
    public int totalPrice() {
        return this.price * this.count;
    }
    
}

class Product {
    
    String code;
    String name;
    
    public Product(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
}

class Customer {
    
    String name;
    Address address;
    
    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
}

class Address {
    
    String zipcode;
    String prefecture;
    String city;
    String addr;
    String building;
    
    public Address(String zipcode, String prefecture, String city, String addr, String building) {
        this.zipcode    = zipcode;
        this.prefecture = prefecture;
        this.city       = city;
        this.addr       = addr;
        this.building   = building;
    }
     
}

public class NetShop1 {
    
    public static void main(String[] args) {
        // create product
        Product prod1 = new Product("A1001", "子供用靴下");
        Product prod2 = new Product("A1002", "子供用ズボン");
        // create customer
        Address addr = new Address("154-001", "東京都", "渋谷区", "宇田川町X-X-X", "渋谷ビル1F");
        Customer customer = new Customer("山田花子", addr);
        // create order
        SalesOrder order = new SalesOrder(customer);
        order.add(prod1, 800, 4);
        order.add(prod2, 3000, 2);
        //
        order.submit();
    }

}
