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
public class Package {
    private int weight;
    private char method;
    protected double cost;
    
    public Package(final int w, final char m){
        weight = w;
        method = m;
        cost = calculateCost();
    }
    
    public void display(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Weight -> "+weight+"\nShipping method -> "+method+"\nCost -> "+cost;
    }
    
    public final double calculateCost(){
        switch (method) {
            case 'A':
                if (weight>=1 && weight<=8) {
                    return 2.00;
                } else if (weight>=9 && weight<=16) {
                    return  3.00;
                } else {
                    return 4.50;
                }
            case 'T':
                if (weight>=1 && weight<=8) {
                    return 1.50;
                } else if (weight>=9 && weight<=16) {
                    return 2.35;
                } else{
                    return 3.25;
                }
            case 'M':
                if (weight>=1 && weight<=8) {
                    return 0.50;
                } else if (weight>=9 && weight<=16) {
                    return 1.50;
                } else{
                    return 2.15;
                }
            default:
                return 0.00;
        }
    }
    
}
