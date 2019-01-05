package URI_Problem;

import static java.lang.Math.abs;
import java.util.Scanner;

public class The_Greatest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();
        int majorx1x2 = (x1 + x2 + abs(x1 - x2)) / 2;
        int majorx1x2x3 = (majorx1x2 + x3 + abs(majorx1x2 - x3)) /2;
        System.out.println(majorx1x2x3 + " eh o maior");
    }

}
