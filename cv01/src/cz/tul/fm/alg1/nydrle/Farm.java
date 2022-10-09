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
public class Farm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pocetHus, pocetKraliku;
        pocetHus = sc.nextInt();
        pocetKraliku = sc.nextInt();
        
        int pocetZvirat, pocetNohou;
        pocetZvirat = pocetHus + pocetKraliku;
        pocetNohou = pocetHus * 2 + pocetKraliku * 4;
        
        String message = String.format("Na farme je %d zvirat a mají %d nohou", pocetZvirat, pocetNohou);
        System.out.println(message);
    }
}
