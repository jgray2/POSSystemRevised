
package possystem;


/**
 *
 * @author Jenni
 */
public class CashRegister {
    Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new XmasDiscountStrategy()),
        new Product("B205", "Men's Dress Shirt", 35.50, new XmasDiscountStrategy()),
        new Product("C222", "Women's Socks", 9.50, new NoDiscountStrategy())
    };
  
    
    Customer[] customers = {
        new Customer("C01", "Bob Smith"),
        new Customer("C02", "Jim Jones"),
        new Customer("C03", "Sally Fields")
    };
    private Receipt receipt;

    public Product[] getProducts() {
        return products;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void startNewSale(String customerID) {
        Customer customer = null;
        for (Customer c : customers) {
            if (customerID.equals(c.getCustomerID())) {
                customer = c;
                break;
            }
        }
        // if found, add the customer to the receipt
        if (customer != null) {
            receipt.addCustomer(customer);
        }
    }

    public void addItemToSale(String prodId, int qty) {
        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getProdID())) {
                product = p;
                break;
            }
        }
        // if found, add the lineItem to the receipt
        if (product != null) {
            receipt.addLineItem(product, qty);
        }
    }

    public void finalizeSale() {
        receipt.printReceiptLineItems();
        System.out.println(receipt.getTotalBeforeDiscount());
        System.out.println("Total: " + receipt.getTotalAfterDiscount());
        System.out.println("Total Savings: " + receipt.getSavings());
    }
}

