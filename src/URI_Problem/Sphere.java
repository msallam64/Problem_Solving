package URI_Problem;

import static java.lang.Math.PI;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Sphere {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double R = input.nextDouble();
        double VOLUME = 3.14159 * R * R * R * (4.0 / 3);
        String a = df.format(VOLUME);
        System.out.println("VOLUME = " + a);
    }

}
