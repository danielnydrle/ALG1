/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02_integers;

/**
 * Test case
 * in: 1 1 10
 * out: 3670
 * 
 * @author Daniel
 */
public class Race01 {
    public static void main(String[] args) {
        
        int seconds, minutes, hours;
        final int SECONDS_IN_MINUTE = 60;
        final int SECONDS_IN_HOUR = 3600;
        
        hours = 1;
        minutes = 1;
        seconds = 10;
        int vysledneSekundy = seconds + minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_HOUR;
        
        System.out.println(vysledneSekundy);
    }
}
