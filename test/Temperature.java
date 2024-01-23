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
public class Temperature {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula: (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5/9;

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius + "°C");

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
    
}
