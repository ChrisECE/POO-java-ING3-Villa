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
public class Customer extends Person{
    protected int number;
    protected boolean mail;
    
    public Customer(String nam,String ad,long num,int nb,boolean b){
        super(nam,ad,num);
        number=nb;
        mail=b;
    }
    
    public void displayC(){
        System.out.println("Customer's number -> "+number+"\nMailing list? -> "+mail);
    }
    
    /*public int getCustomNumber(){
        return number;
    }
    public boolean getMail(){
        return mail;
    }*/
}
