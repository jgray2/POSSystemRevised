/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

/**
 *
 * @author Jenni
 */
public class StartUp {
    public static void main(String[] args) {
        CashRegister register = new CashRegister ();
        
        register.startNewSale("C02");
        register.addItemToSale("A101", 3);
        register.finalizeSale();
        
    }
    
}
