/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week04_branching;

/**
 *
 * @author Daniel
 */
public class NationalIDNumber15 {
    public static void main(String[] args) {
        long first = 681102;
        int second = 777;
        
        long idWithoutLastDigit = (first*1000) + (second/10);
        
        System.out.println(idWithoutLastDigit);
        
        long modulo = (idWithoutLastDigit) % 11;
        
        boolean isValid = (modulo == (second % 10)) || (modulo == 10);
        
        String textIsValid = isValid ? "je" : "neni";
        
        System.out.printf("Rodne cislo %s validni%n", textIsValid);
    }
}
