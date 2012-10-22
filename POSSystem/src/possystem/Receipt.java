
package possystem;

/**
 *
 * @author Jenni
 */
public class Receipt {
    private LineItem lineItem;
    private Customer customer;
    private int qty;
    private Product product;
    LineItem[] lineItems = new LineItem[1];
    private double moneySaved;
    private double saleGrandTotal;
    private double grandTotal;
    private double unitPrice;
    private double salePrice;

    // Here's how to add a purchased product as a LineItem
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }

    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItem, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    // Here's how to loop through all the line items and get a grand total

    public double getTotalBeforeDiscount() {
        for (LineItem item : lineItems) {
            grandTotal += item.getOriginalPriceSubtotal();
        }
        return grandTotal;
    }

    public double getTotalAfterDiscount() {
        for (LineItem item : lineItems) {
            saleGrandTotal += item.getSalePriceSubtotal();
        }
        return saleGrandTotal;
    }

    public double getSavings() {
        return moneySaved = grandTotal - saleGrandTotal;
    }
    
    public double getProductUnitPrice() {
        return product.getUnitPrice();
    }
    
    public double getSalePrice() {
        return product.getUnitPrice() * product.getDiscount();
    }
    
    public void printReceiptLineItems() {
         for (LineItem item : lineItems) {
         System.out.println(this.getProduct() + "\t" + this.getQty() 
                + "\t" + this.getProductUnitPrice() + "\t" 
                + this.getSalePrice());
        }
        
    }

}
