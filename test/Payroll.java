/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author BIMSARA
 */
public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input: hourly rate and hours worked
        System.out.print("Enter your hourly rate: LKR");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Calculate gross pay
        double grossPay = hourlyRate * hoursWorked;

        // Calculate withholding tax (15% of gross pay)
        double withholdingTaxRate = 0.15;
        double withholdingTax = grossPay * withholdingTaxRate;

        // Calculate net pay (gross pay - withholding tax)
        double netPay = grossPay - withholdingTax;

        // Display results
        System.out.println("\nPayroll Summary");
        System.out.println("------------------------------");
        System.out.println("Hourly Rate     : LKR "+ hourlyRate);
        System.out.println("Hours Worked    : "+ hoursWorked);
        System.out.println("Gross Pay       : LKR "+ grossPay);
        System.out.println("Withholding Tax : LKR "+ withholdingTax);
        System.out.println("Net Pay         : LKR "+ netPay);

        scanner.close();
    }
    
}
