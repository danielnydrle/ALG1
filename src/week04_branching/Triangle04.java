/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week04_branching;

import java.util.Scanner;

/**
 *
 * TESTCASE 1
 * in: 3 4 5
 * out: ano
 * 
 * TESTCASE 2
 * in: 3 4 60
 * out: ne
 * 
 * @author Daniel
 */
public class Triangle04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        boolean constructable = (a+b > c && b+c > a && a+c > b) &&
                (Math.abs(a-b) < c && Math.abs(b-c) < a && Math.abs(a-c) < b);
        
        String textConstructable = constructable ? "lze" : "nelze";
        
        System.out.printf("Trojuhelnik %s sestrojit", textConstructable);
    }
}
