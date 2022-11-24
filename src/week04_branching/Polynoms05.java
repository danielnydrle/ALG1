/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week04_branching;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Polynoms05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //out 
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x_1;
        double x_2;
        
        double D = Math.pow(b, 2)-4*a*c;
        
        //out 
        if (D < 0)
            System.out.println("nelze vyřešit");
        else if (D == 0) {
            x_1 = -b/(2*a);
            System.out.printf("x = %.2f", x_1);
        }
        else {
            x_1 = (-b + Math.sqrt(D))/(2*a);
            x_2 = (-b - Math.sqrt(D))/(2*a);
            System.out.printf("x1 = %.2f, x2 = %.2f%n", x_1, x_2);
        }
    }
}
