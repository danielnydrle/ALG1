/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02_integers;

/**
 *
 * @author Daniel
 */
public class Integers03 {
    public static void main(String[] args) {
        int sum = 1565;
        int total = sum;
        
        int hundreds, fifties, twenties, tens, fives, twos, ones;
        
        hundreds = total/100;
        total = total % 100;
        
        fifties = total/50;
        total = total % 50;
        
        twenties = total/20;
        total = total % 20;
        
        tens = total/10;
        total = total % 10;
        
        fives = total/5;
        total = total % 5;
        
        twos = total/2;
        total = total % 2;
        
        ones = total;
        
        System.out.printf(
                "%10s %5d %5d %5d %5d %5d %5d %5d\n",
                "Bankovky:", 100, 50, 20,
                10, 5, 2, 1
        );
        
        System.out.printf(
            "%10s %5d %5d %5d %5d %5d %5d %5d\n",
            "Pocty:", hundreds, fifties, twenties,
            tens, fives, twos, ones
        );
    }
}
