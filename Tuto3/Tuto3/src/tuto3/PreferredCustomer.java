/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto3;

/**
 *
 * @author chris
 */
public class PreferredCustomer extends Customer {
    private double amount;
    private int level;
    
    public PreferredCustomer(final String nam, final String ad, final long num, final int nb, final boolean b, final double amoun){
        super(nam, ad, num, nb, b);
        amount = amoun;
    }
    
    public void displayAll(){
        displayP();
        displayC();
        System.out.println("Amount -> "+amount+"£"+"\nDiscount level -> "+level+"%");
    }
    
    /*public double getAmount(){
        return amount;
    }
    
    public int getLevel(){
        return level;
    }*/
    
    public void setAmount(final double a){
        amount = a;
    }
    
    public void setLevel(){
        if (amount>=2000){
            level=10;
        } else if (amount>=1500) {
            level=7;
        } else if (amount>=1000) {
            level=6;
        } else if (amount>=500) {
            level=5;
        } else {
            level=0;
        }
    }
}
