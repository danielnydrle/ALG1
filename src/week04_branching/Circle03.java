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
public class Circle03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final short V_KRUZNICI = 0;
        final short NA_KRUZNICI = 1;
        final short MIMO_KRUZNICI = 2;
        final double PRECISION = 0.00001;
        
        
        double X_x = 5;
        double X_y = 0;
        
        double k_Sx = 0;
        double k_Sy = 0;
        double k_r = 5;
        
        double distance = PointDistance(X_x, X_y, k_Sx, k_Sy);
        System.out.println(distance);
        short circleRelation = 0;
        
        if (Math.abs(distance - k_r) < PRECISION)
            circleRelation = NA_KRUZNICI;
        else if (distance < k_r)
            circleRelation = V_KRUZNICI;
        else
            circleRelation = MIMO_KRUZNICI;
        
        String outputMessage = "";
        
        switch (circleRelation)
        {
            case V_KRUZNICI -> outputMessage = "vevnitr";
            case NA_KRUZNICI -> outputMessage = "na";
            case MIMO_KRUZNICI -> outputMessage = "vne";
        }
        
        System.out.printf("Bod je %s kruznice", outputMessage);
    }
    
    public static double PointDistance(double ax, double ay, double bx, double by) {
        //sqrt((xx-yx)^2 + (xy-yy)^2)
        return Math.sqrt(
            Math.pow((ax-bx),2)+
            Math.pow((ay-by), 2)
        );
    }
}
