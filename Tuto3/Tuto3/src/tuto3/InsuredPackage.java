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
public class InsuredPackage extends Package{
    public InsuredPackage(int weight,char method){
        super(weight,method);
        if(cost>=0 && cost<=1.00){
            cost+=2.45;
        }
        else if(cost>=1.01 && cost<=3.00){
            cost+=3.95;
        }
        else{
            cost+=5.55;
        }
    }
}
