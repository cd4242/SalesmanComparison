/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salescomparison;

import java.util.Scanner;
import java.util.Locale;


/**
 *
 * @author Family
 */
public class SalesmenNames {
    public static String firstName;
    public static String lastName;
    public static String firstNameTwo;
    public static String lastNameTwo;
    
    
    
    
    
    public void simpleMessage(){
   
      java.util.Scanner scan = new java.util.Scanner (System.in);
      
       //asks for first and last names of the different salesmen
      
       System.out.print("Enter the first name of the first salesman:");
       firstName = scan.next();
       
       System.out.print("Enter the last name of the first salesman:");
       lastName = scan.next();
       
       System.out.println("The first salesman's full name is:");
       System.out.println(firstName + " " + lastName);
       
       
       System.out.print("Enter the first name of the second salesman:");
       firstNameTwo = scan.next();
       
       System.out.print("Enter the last name of the second salesman:");
       lastNameTwo = scan.next();
       
       System.out.println("The second salesman's full name is:");
       System.out.println(firstNameTwo + " " + lastNameTwo);
       
       System.out.println("The two salemen being compared are:");
       System.out.println((firstName +" "+ lastName) + " and " + (firstNameTwo +" "+ lastNameTwo));
       
              
    
    
    
    
    }
}
