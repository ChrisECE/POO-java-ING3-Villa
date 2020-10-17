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
public class LabCourse extends CollegeCourse{
    public LabCourse(String dep, int nb, int credit){
        super(dep,nb,credit);
        fee+=50;
    }
    
    @Override
    public void display(){
        System.out.println("This is a lab course");
        System.out.println("Department -> "+department+"\nCourse number -> "+courseNb+"\nCredits -> "+credits+"\nFee -> "+fee);
    }
}
