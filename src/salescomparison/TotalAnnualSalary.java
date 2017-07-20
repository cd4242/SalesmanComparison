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
public class TotalAnnualSalary extends SalesmenNames{
    public void SimpleMessageTwo(){
        
        java.util.Scanner scan = new java.util.Scanner (System.in);
        
        
        double baseSalary = 30000;
        double commissionRate = 0;
        
        double totalNumberOfSales = 0;
        do{
            try{
            //Shows "Enter total number of annual sales"  
             System.out.print("Enter total number of annual sales for " + firstName +" "+ lastName + ":$");
                
             //Sets total number of sales to what the user inputs  
             totalNumberOfSales = scan.nextInt();
                break;
            }
            catch(Exception e){
                System.out.println("Input numbers only");
                scan.nextLine();
            }
        }while(totalNumberOfSales >= 0);
        
        if(totalNumberOfSales < 319999)
            commissionRate = 0;
        else if(totalNumberOfSales < 399999)
            commissionRate = .08;
        else if(totalNumberOfSales > 400000)
            commissionRate = .10;
        else 
            commissionRate = 0;
        
        
        
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        
        
        System.out.println("Commision earned for " + firstName +" "+ lastName + " =");
        System.out.println(moneyFormatter.format(commissionRate * totalNumberOfSales));
        
        double totalCommission = (commissionRate * totalNumberOfSales);
        double totalAnnualIncome = (totalCommission + baseSalary);
        
        System.out.println("The total annual salary (including commision) for " + firstName +" "+ lastName + " =");
        System.out.println(moneyFormatter.format(totalAnnualIncome));
        
        double totalNumberOfSalesTwo = 0;
        do{
            try{
            //Shows "Enter total number of annual sales"  
             System.out.print("Enter total number of annual sales for " + firstNameTwo +" "+ lastNameTwo + ":$");
                
             //Sets total number of sales to what the user inputs  
             totalNumberOfSalesTwo = scan.nextInt();
                break;
            }
            catch(Exception e){
                System.out.println("Input numbers only");
                scan.nextLine();
            }
        }while(totalNumberOfSalesTwo >= 0);
        
        if(totalNumberOfSalesTwo < 319999)
            commissionRate = 0;
        else if(totalNumberOfSalesTwo < 399999)
            commissionRate = .08;
        else if(totalNumberOfSalesTwo > 400000)
            commissionRate = .10;
        else 
            commissionRate = 0;
        
        
        
        System.out.println("Commision earned for " + firstNameTwo +" "+ lastNameTwo + " =");
        System.out.println(moneyFormatter.format(commissionRate * totalNumberOfSalesTwo));
        
        double totalCommissionTwo = (totalNumberOfSalesTwo * commissionRate);
        double totalAnnualIncomeTwo = (totalCommissionTwo + baseSalary);
        
        System.out.println("The total annual salary (including commision) for " + firstNameTwo +" "+ lastNameTwo + " =");
        System.out.println(moneyFormatter.format(totalAnnualIncomeTwo));
        
        double mustAchieveGoal = 0;
        if(totalAnnualIncome > totalAnnualIncomeTwo)
            mustAchieveGoal = (totalNumberOfSales - totalNumberOfSalesTwo);
        else if(totalAnnualIncomeTwo > totalAnnualIncome)
            mustAchieveGoal = (totalNumberOfSalesTwo - totalNumberOfSales);
            
               
        if (totalAnnualIncome > totalAnnualIncomeTwo)
            System.out.println(firstNameTwo + " " + lastNameTwo + " must achieve $" + NumberFormat.getNumberInstance(Locale.US).format(mustAchieveGoal) + " or more in sales to match or exceed " + firstName + " " + lastName + "'s total annual income");
        else if (totalAnnualIncomeTwo > totalAnnualIncome)
            System.out.println(firstName + " " + lastName + " must achieve $" + NumberFormat.getNumberInstance(Locale.US).format(mustAchieveGoal) + " or more in sales to match or exceed " + firstNameTwo + " " + lastNameTwo + "'s total annual income");
        
        
        
        System.out.println("Potential Total Annual Compensation");
        System.out.println("totalNumberOfSales\ttotalAnnualIncome");
        System.out.println(" ");
        
        
        
        
        
        
        
        double[][] potentialCompensation = new double[11][2];
        
        potentialCompensation[0][0] = totalNumberOfSales;
        potentialCompensation[0][1] = totalAnnualIncome;
        potentialCompensation[1][0] = totalNumberOfSales + 5000;
        potentialCompensation[1][1] = (commissionRate * (totalNumberOfSales + 5000)) + baseSalary;
        potentialCompensation[2][0] = totalNumberOfSales + 10000;
        potentialCompensation[2][1] = (commissionRate * (totalNumberOfSales + 10000)) + baseSalary;
        potentialCompensation[3][0] = totalNumberOfSales + 15000;
        potentialCompensation[3][1] = (commissionRate * (totalNumberOfSales + 15000)) + baseSalary;
        potentialCompensation[4][0] = totalNumberOfSales + 20000;
        potentialCompensation[4][1] = (commissionRate * (totalNumberOfSales + 20000)) + baseSalary;
        potentialCompensation[5][0] = totalNumberOfSales + 25000;
        potentialCompensation[5][1] = (commissionRate * (totalNumberOfSales + 25000)) + baseSalary;
        potentialCompensation[6][0] = totalNumberOfSales + 30000;
        potentialCompensation[6][1] = (commissionRate * (totalNumberOfSales + 30000)) + baseSalary;
        potentialCompensation[7][0] = totalNumberOfSales + 35000;
        potentialCompensation[7][1] = (commissionRate * (totalNumberOfSales + 35000)) + baseSalary;
        potentialCompensation[8][0] = totalNumberOfSales + 40000;
        potentialCompensation[8][1] = (commissionRate * (totalNumberOfSales + 40000)) + baseSalary;
        potentialCompensation[9][0] = totalNumberOfSales + 45000;
        potentialCompensation[9][1] = (commissionRate * (totalNumberOfSales + 45000)) + baseSalary;
        potentialCompensation[10][0] = totalNumberOfSales + 50000;
        potentialCompensation[10][1] = (commissionRate * (totalNumberOfSales + 50000)) + baseSalary;
        
        
        
        
        int rows = 11;
        int columns = 2;
        int i, j; 
        
        for (i = 0; i < rows; i ++){
            for (j = 0; j < columns; j ++){
                System.out.print(moneyFormatter.format(potentialCompensation[i][j]) + "                ");
            }
             System.out.println("");
        
        
        
        
        
        
        
            }
        }
    }
    
        
    

