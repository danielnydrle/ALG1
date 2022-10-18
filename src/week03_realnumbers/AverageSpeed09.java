/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week03_realnumbers;

import java.util.Scanner;

/**
 *
 * TESTCASE 1
 * in: 50 2.3 0 0 5 10 10 40 600 800
 * out: 25.075712 km/h, 0.000000 km/h
 * out: 
 * 
 * TESTCASE 2
 * in: 70 4 0 0 1 2 20 50 474 831
 * out: 159.367841 km/h, 89.367841 km/h
 * 
 * @author Daniel
 */
public class AverageSpeed09 {
    final static double MINUTES_IN_HOUR = (double)1/(double)60;
    final static double SECONDS_IN_HOUR = MINUTES_IN_HOUR/(double)60;
    final static double MILISECONDS_IN_HOUR = SECONDS_IN_HOUR/(double)1000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //in
        int maxAllowedSpeed = sc.nextInt(); //[km/h]
        double sectionLength = sc.nextDouble(); //[km]
        int startHours = sc.nextInt();
        int finishHours = sc.nextInt();
        int startMinutes = sc.nextInt();
        int finishMinutes = sc.nextInt();
        int startSeconds = sc.nextInt();
        int finishSeconds = sc.nextInt();
        int startMiliseconds = sc.nextInt();
        int finishMiliseconds = sc.nextInt();
        
        //calc
        int passageHours = finishHours - startHours;
        int passageMinutes = finishMinutes - startMinutes;
        int passageSeconds = finishSeconds - startSeconds;
        int passageMiliseconds = finishMiliseconds - startMiliseconds;
        
        double averageSpeed = AverageSpeed(
            sectionLength,
            DecimalHours(passageHours, passageMinutes,
                    passageSeconds, passageMiliseconds
            )
        );
          
        double speeding = maxAllowedSpeed < averageSpeed
            ? -(maxAllowedSpeed - averageSpeed)
            : 0;
        
        //out
        System.out.printf("průměrná rychlost: %f km/h%n", averageSpeed);
        System.out.printf("rychlost překročena o: %f km/h", speeding);
    }
    
    public static double DecimalHours (int hours, int minutes, int seconds, int miliseconds) {
        return (double)hours +
            (double)minutes * MINUTES_IN_HOUR +
            (double)seconds * SECONDS_IN_HOUR +
            (double)miliseconds * MILISECONDS_IN_HOUR;
            
    }
    
    public static double AverageSpeed (double sectionLength, double hours) {
        return sectionLength / hours;
    }
}
