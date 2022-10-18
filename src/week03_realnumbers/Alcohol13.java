/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week03_realnumbers;

/**
 *
 * in: 1 5 80 6
 * out: 
 * @author Daniel
 */
public class Alcohol13 {
    
    
    public static void main(String[] args) {
        
        //consts
        final double RHO = 0.8; // ethanol density [g.cm^-3]
        final double R = 0.6; // water in organism [%]
        final double BETA = 0.085; // alcohol degradation speed [g.h]
        
        //in
        double q = 1000; // alcohol volume [ml]
        double p = 5; // alcohol concentration [%]
        double m = 80; // consument weight [kg]
        double t = 4; // time from consumption [h]
        
        //calc
        
        double m_et = q*(p/100)*RHO; // ethanol weight [g]
        double prom = m_et/(m * R); // per milles [g/kg]
        double u_et = m * BETA; // degradation speed [g/hod]
        
        //out        
        double c_t = (m_et - (u_et * (t-1)))/(m*R); // per milles after t hours [%]
        double t_0 = m_et/u_et; // hours when there is no alcohol left in blood [h]
        //c_t = (m_et - 0.1 * m_et)/(m * R)-BETA*t;
        
        System.out.printf("%.2f %% %n", c_t);
        System.out.printf("%.2f h%n", t_0);
    }
}
