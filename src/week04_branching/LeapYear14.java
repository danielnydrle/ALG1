/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week04_branching;

/**
 *
 * @author Daniel
 */
public class LeapYear14 {
    public static void main(String[] args) {
        int year = 2200;
        
        //out
        boolean isLeap = false;
        int daysInYear = 365;
        
        if (year % 4 == 0) {
            isLeap = !(year % 100 == 0 && year % 400 != 0);
        }
        
        daysInYear = isLeap ? 366 : 365;
        
        System.out.printf("%d%n", daysInYear);
    }
}
