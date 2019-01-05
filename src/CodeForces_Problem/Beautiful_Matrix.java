package CodeForces_Problem;

import java.util.Scanner;

public class Beautiful_Matrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count,x = 0, y = 0, val = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                val = in.nextInt();
                if (val == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        count=Math.abs(x-3);
        count=count+Math.abs(y-3);
        System.out.println(count);

    }
}
