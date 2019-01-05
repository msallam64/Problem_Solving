package URI_Problem;

import java.util.Scanner;

public class Time_Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, H, M, S;
        N = sc.nextInt();

        H = N / 3600;
        N = N - (H * 3600);
        M = N / 60;
        S = N - (M * 60);
        System.out.println(H+":"+M+":"+S);

    }

}
