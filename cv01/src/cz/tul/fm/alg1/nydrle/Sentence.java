/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.tul.fm.alg1.nydrle;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vlozte jmeno, rok a tridu");
        String jmeno = sc.next();
        int rok = sc.nextInt();
        char trida = sc.next().charAt(0);
        
        int vek = 2022 - rok;
        if (vek > 6 || vek < 16) {
            int rocnik = vek - 6;
            String message = String.format("Dite %s ma %d let a chodi do %d.%S", jmeno, vek, rocnik, trida);
            System.out.println(message);
        }
    }
}
