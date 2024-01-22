/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author BIMSARA
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Minutes : ");
        int time = input.nextInt();
        int hour, minutes;

        hour = time / 60;
        System.out.print(hour + " Hours ");

        minutes = time % 60;
        System.out.println(minutes + " Minutes");
    }

}
