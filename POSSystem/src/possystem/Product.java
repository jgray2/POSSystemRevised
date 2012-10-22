/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

/**
 *
 * @author Jenni
 */
public class Product {
     private String prodID;
    private String description;
    private double unitPrice;
    private DiscountStrategy discount;
    
    public Product (String prodID, String description, double unitPrice, 
            DiscountStrategy discount) {
        this.prodID = prodID;
        this.description = description;
        this.unitPrice = unitPrice;
        this.discount = discount;  
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount.getDiscount(unitPrice);
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
}
