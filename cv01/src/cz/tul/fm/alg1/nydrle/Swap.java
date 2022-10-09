package cz.tul.fm.alg1.nydrle;

/**
 *
 * @author Daniel
 */
public class Swap {
    public static void main(String[] args) {
        int a = 34;
        int b = 89;

        // bez výměny v paměti
        System.out.println(String.format("%d %d", b, a));

        // s výměnou v paměti s pomocnou proměnnou
        int temp = b;
        b = a;
        a = temp;
        System.out.println(String.format("%d %d", a, b));
        
        // s výměnou v paměti bez pomocné proměnné
        a = a ^ b ^ (b = a);
        System.out.println(String.format("%d %d", a, b));
    }
}
