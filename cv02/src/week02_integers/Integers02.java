/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02_integers;

/**
 *
 * @author Daniel
 */
public class Integers02 {
    public static void main(String[] args) {
        
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        
        int seconds = 65756;
        
        int hours = seconds/SECONDS_IN_HOUR;
        seconds -= (hours * SECONDS_IN_HOUR);
        
        int minutes = seconds/SECONDS_IN_MINUTE;
        seconds -= (minutes * SECONDS_IN_MINUTE);
        
        String message = String.format("%d:%d:%d", hours, minutes, seconds);
        System.out.println(message);
        
    }
}
