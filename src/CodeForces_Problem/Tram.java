package CodeForces_Problem;

import java.util.Scanner;

public class Tram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, exitn, entern, max, tram;
        while (in.hasNextInt()) {
            n = in.nextInt();
            tram = max = 0;
            for (int i = 0; i < n; i++) {
                exitn = in.nextInt();
                entern = in.nextInt();
                tram = tram - exitn;
                tram = tram + entern;
                if (tram > max) {
                    max=tram;
                    
                }
            }
            System.out.println(max);
        }

    }

}
