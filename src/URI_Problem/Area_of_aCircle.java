package URI_Problem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area_of_aCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        DecimalFormat df = new DecimalFormat("0.0000");
        String A = df.format(3.14159 * R * R);
        System.out.println("A=" + A);
        
    }

}
