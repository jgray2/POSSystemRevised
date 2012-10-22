/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

/**
 *
 * @author Jenni
 */
public class XmasDiscountStrategy implements DiscountStrategy {
     private double percDiscount = 0.30;
    private double discount;
    
    @Override
    public double getDiscount(double price) {
        return discount = price * percDiscount;
    }
    
}
