/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week03_realnumbers;

import java.util.Scanner;

/**
 *
 * TESTCASE 1
 * in: 0 0 1 3 3 0
 * out: 9.767829 m, 4.500000 m^2
 * 
 * TESTCASE 2
 * in: 1 1.5 2 4 3.5 2
 * out: 7.742092 m, 2.875000 m^2
 *
 * @author Daniel
 */
public class Triangles17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //in
        double ax = sc.nextDouble();
        double ay = sc.nextDouble();
        double bx = sc.nextDouble();
        double by = sc.nextDouble();
        double cx = sc.nextDouble();
        double cy = sc.nextDouble();
        
        //calc
        double a = PointDistance(bx, by, cx, cy);
        double b = PointDistance(ax, ay, cx, cy);
        double c = PointDistance(ax, ay, bx, by);
        
        double triangleCircumference = a + b + c;
        double triangleArea = TriangleArea(a, b, c);
        
        //out
        System.out.printf("Obvod: %f m%n", triangleCircumference);
        System.out.printf("Plocha: %f m^2%n", triangleArea);
    }
    
    public static double PointDistance(double ax, double ay, double bx, double by) {
        //sqrt((xx-yx)^2 + (xy-yy)^2)
        return Math.sqrt(
            Math.pow((ax-bx),2)+
            Math.pow((ay-by), 2)
        );
    }
    
    public static double TriangleArea(double a, double b, double c) {
        double s = (a + b + c) / (double)2;
        return Math.sqrt(
            s*(s-a)*(s-b)*(s-c)
        );
    }
}
