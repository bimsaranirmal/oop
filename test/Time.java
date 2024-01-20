/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author BIMSARA
 */
public class Time {
    
     public static void main(String[] args) {
               int time = 197;
               System.out.println("Input Minutes : " + time +" minutes"); 

               int hour, minutes;
                
               hour = time/60;
               System.out.print(hour + " Hours ");
               
               minutes = time%60;
               System.out.println(minutes + " Minutes");
    }
    
}
