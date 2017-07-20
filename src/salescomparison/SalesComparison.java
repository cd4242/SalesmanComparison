/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salescomparison;

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Family
 */
public class SalesComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        java.util.Scanner scan = new java.util.Scanner (System.in);
        
        // calls for SalesmenNames class
        SalesmenNames SalesmenNamesObject = new SalesmenNames();
        SalesmenNamesObject.simpleMessage();
        
        // calls for TotalAnnualSalary class
        TotalAnnualSalary TotalAnnualSalaryObject = new TotalAnnualSalary();
        TotalAnnualSalaryObject.SimpleMessageTwo();
        
        
                
    }
  }


//References 
//(2016). How to Format money with NumberFormat in Java. Retrieved from 
//https://www.youtube.com/watch?v=iZDGm0BWqcY 

//(2016). Java Programming Tutorial - 14 - Using Multiple Classes . Retrieved 
//from https://www.youtube.com/watch?v=XqTg2buXS5o 

//(2016). JavaInputMismatchException. Retrieved from 
//http://stackoverflow.com/questions/16816250/java-inputmismatchexception

//Java - Inheritance. (2016). Retrieved from 
//http://www.tutorialspoint.com/java/java_inheritance.htm

