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
public class CabinRental {
    protected int number;
    protected double weeklyRR; //Weekly Rental Rate
    
    public CabinRental(int nb){
        number=nb;
        if(nb==1 || nb==2 || nb==3) weeklyRR=950;
        else weeklyRR=1100;
    }
    
    public int getNumber(){
        return number;
    }
    public double getWeeklyRR(){
        return weeklyRR;
    }
}

