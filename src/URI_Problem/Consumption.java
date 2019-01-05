package URI_Problem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Consumption {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        double Y = input.nextDouble();
        double Z=X/Y;
        String a=df.format(Z);
        System.out.println(a+" km/l");

    }

}
