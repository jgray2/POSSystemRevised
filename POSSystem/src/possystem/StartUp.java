/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jenni
 */
public class StartUp {

    public static void main(String[] args) {
        Product product1 = new Product("A101", "Baseball Hat",
                19.95, new XmasDiscountStrategy());
        Product product2 = new Product("B205", "Men's Dress Shirt",
                35.50, new XmasDiscountStrategy());
        Product product3 = new Product("C222", "Women's Socks",
                9.50, new NoDiscountStrategy());

        Map<String, Product> mapProducts = new HashMap<String, Product>();
        mapProducts.put(product1.getProdID(), product1);
        mapProducts.put(product2.getProdID(), product2);
        mapProducts.put(product3.getProdID(), product3);

        Customer customer1 = new Customer("CO1", "Bob Smith");
        Customer customer2 = new Customer("CO2", "Jim Jones");
        Customer customer3 = new Customer("C03", "Sally Fields");

        Map<String, Customer> mapCustomers = new HashMap<String, Customer>();
        mapCustomers.put(customer1.getCustomerID(), customer1);
        mapCustomers.put(customer2.getCustomerID(), customer2);
        mapCustomers.put(customer3.getCustomerID(), customer3);


        CashRegister register = new CashRegister();

        register.startNewSale("C02");
        register.addItemToSale("A101", 3);
        register.finalizeSale();

    }
}
