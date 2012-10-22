/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

/**
 *
 * @author Jenni
 */
public class LineItem {
    private Product product;
    private double quantity;
    private double subtotal;
    private double saleSubtotal;

    public LineItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getOriginalPriceSubtotal() {
        return subtotal = quantity * product.getUnitPrice();
    }
    
    public double getSalePriceSubtotal(){
        return saleSubtotal = quantity * product.getUnitPrice() 
                * product.getDiscount();
    }
}
