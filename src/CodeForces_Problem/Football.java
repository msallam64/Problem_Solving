package CodeForces_Problem;

import java.util.Scanner;

public class Football {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String team = in.next();
        char[] cTeam = team.toCharArray();
        if (cTeam.length < 7) {
            System.out.println("NO");
            return;
        } else {
            for (int i = 0; i < cTeam.length; i++) {
                char ans = cTeam[i];
                int check = 1;
                for (int y = i + 1; y < cTeam.length; y++) {
                    if (cTeam[y] != ans) {
                        break;
                    }
                    if (cTeam[y] == ans) {
                        check++;
                    }
                }
                if (check >= 7) {
                    System.out.println("YES");

                    return;
                }
            }
        }
        System.out.println("NO");

    }

}
