package CodeForces_Problem;

import java.util.Scanner;

public class Theatre_Square {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long m, n, a;
        n = in.nextLong();
        m = in.nextLong();
        a = in.nextLong();
        long total=(long) (((n + a - 1) / a) * ((m + a - 1) / a));
        

        System.out.println(total);
    }
}
//1000000000 1000000000 1
