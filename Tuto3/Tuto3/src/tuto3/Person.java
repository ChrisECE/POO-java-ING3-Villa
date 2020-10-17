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
public class Person {
    protected String name;
    protected String address;
    protected long phoneNb;
    
    public Person(String nam,String ad,long nb){
        name=nam;
        address=ad;
        phoneNb=nb;
    }
    
    public void displayP(){
        System.out.println("Name -> "+name+"\nAddress -> "+address+"\nPhone number -> "+phoneNb);
    }
    
    /*public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getNumber(){
        return phoneNb;
    }*/
}
