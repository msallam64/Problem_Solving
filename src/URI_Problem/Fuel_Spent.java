package URI_Problem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Fuel_Spent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        int T = input.nextInt();
        int V = input.nextInt();
        double L = (V * T) / 12.0;
        String a = df.format(L);
        System.out.println(a);

    }

}
