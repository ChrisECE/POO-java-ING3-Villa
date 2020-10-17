/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto3;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class Tuto3 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //demoCabinRental();
        //useCourse();
        //Q3();
        usePackage();
    }
    
    public static void usePackage(){
        Package p1=new Package(2,'A');
        Package p2=new Package(8,'M');
        Package p3=new Package(20,'T');
        InsuredPackage ip1=new InsuredPackage(40,'A');
        InsuredPackage ip2=new InsuredPackage(10,'T');
        InsuredPackage ip3=new InsuredPackage(1,'M');
        System.out.println("Normal Package :\n");
        p1.display();
        System.out.println();
        p2.display();
        System.out.println();
        p3.display();
        System.out.println("\nInsured Package :\n");
        ip1.display();
        System.out.println();
        ip2.display();
        System.out.println();
        ip3.display();
    }
    
    //I didn't code for the cumulative purchases because the first goal of this exercise is inheritance to my mind.
    public static void Q3(){
        System.out.println("Enter the following informations : name, address, phone number, a customer number, 'true' or 'false' to be on the mailing list"
                +" and the amount of your purchases");
        String name=sc.nextLine();
        String address=sc.nextLine();
        long phoneNb=sc.nextLong();
        sc.nextLine();
        int nb=sc.nextInt();
        sc.nextLine();
        boolean b=sc.nextBoolean();
        double amount=sc.nextDouble();
        PreferredCustomer prefCustom=new PreferredCustomer(name,address,phoneNb,nb,b,amount);
        prefCustom.setLevel();
        prefCustom.displayAll();
    }
    
    public static void useCourse(){
        System.out.println("Enter the course informations : department, course number and credits");
        String rep1=sc.nextLine();
        int rep2=sc.nextInt();
        sc.nextLine();
        int rep3=sc.nextInt();
        if("BIO".equals(rep1) || "CHM".equals(rep1) || "CIS".equals(rep1) || "PHY".equals(rep1)){
            LabCourse obj=new LabCourse(rep1,rep2,rep3);
            obj.display();
        }
        else{
            CollegeCourse obj=new CollegeCourse(rep1,rep2,rep3);
            obj.display();
        }
        
    }
    
    public static void demoCabinRental(){
        System.out.println("Enter the cabin number");
        int rep=sc.nextInt();
        HolidayCabinRental obj=new HolidayCabinRental(rep);
        System.out.println("The cabin number is "+obj.number+"\nThe price is "+obj.weeklyRR+"$");
    }
    
}
