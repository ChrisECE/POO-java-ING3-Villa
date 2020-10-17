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
public class CollegeCourse {
    protected String department;
    protected int courseNb;
    protected int credits;
    protected int fee;
    
    public CollegeCourse(final String dep, final int nb, final int credit){
        department = dep;
        courseNb = nb;
        credits = credit;
        fee = credits*120;
    }
    
    public void display(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Department -> "+department+"\nCourse number -> "+courseNb+"\nCredits -> "+credits+"\nFee -> "+fee;
    }
    
}
