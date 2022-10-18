/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02_integers;

import static java.lang.Integer.parseInt;

/**
 *
 * Test case 1
 * in: 685707/1234
 * out: 7. 7. 1968
 * 
 * Test case 2
 * in: 030305/1234
 * out: 5. 3. 2003
 * 
 * @author Daniel
 */
public class NationalIDNumber04 {
    public static void main(String[] args) {
        int year, month, day;
        
        String id = "688207/1234";
        
        year = parseInt(id.substring(0, 2));
        month = parseInt(id.substring(2, 4));
        day = parseInt(id.substring(4, 6));
        
        //female
        month = month > 50 ? month - 50 : month;
        
        //too many children case
        month = month > 12 ? month - 20 : month;
        
        //year
        year = year < 54 ? year + 2000 : year + 1900;
        
        System.out.printf("%d. %d. %d\n", day, month, year);
    }
}
