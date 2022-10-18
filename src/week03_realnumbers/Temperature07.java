/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week03_realnumbers;

import java.util.Scanner;

/**
 *
 * in: 5.3 16.3 11.2
 * 
 * out: 14.666666666666666
 * @author Daniel
 */

public class Temperature07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        //consts
        final double TEMPERATURE_06_WEIGHT = 1.0;
        final double TEMPERATURE_12_WEIGHT = 1.0;
        final double TEMPERATURE_18_WEIGHT = 2.0;

        final int TEMPERATURES_COUNT = (int)
                (TEMPERATURE_06_WEIGHT +
                TEMPERATURE_12_WEIGHT +
                TEMPERATURE_18_WEIGHT);
        
        //in
        int temperature06 = sc.nextInt();
        int temperature12 = sc.nextInt();
        int temperature18 = sc.nextInt();

        //calc
        double averageTemperature =
            (double)(TEMPERATURE_06_WEIGHT * temperature06 +
            TEMPERATURE_12_WEIGHT * temperature12 +
            TEMPERATURE_18_WEIGHT * temperature18)
            / TEMPERATURES_COUNT;
        
        //out

        System.out.println(averageTemperature);
    }
}
