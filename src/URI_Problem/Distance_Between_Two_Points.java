package URI_Problem;

import static java.lang.Math.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance_Between_Two_Points {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0000");
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2;
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        double z1 = (x2 - x1) * (x2 - x1);
        double z2 = (y2 - y1) * (y2 - y1);
        double Distance = sqrt(z1 + z2);
        String a = df.format(Distance);
        System.out.println(a);

    }
}
