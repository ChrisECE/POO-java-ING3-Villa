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
public class HolidayCabinRental extends CabinRental{
    
    public HolidayCabinRental(int nb){
        super(nb);
        this.weeklyRR+=150;
    }
}
