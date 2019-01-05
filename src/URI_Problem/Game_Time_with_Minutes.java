package URI_Problem;

import java.util.Scanner;

public class Game_Time_with_Minutes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int en_h, st_h, dur_h, en_m, st_m, dur_m;
        st_h = in.nextInt();
        st_m = in.nextInt();
        en_h = in.nextInt();
        en_m = in.nextInt();
        
        dur_h = en_h - st_h;

        if (dur_h < 0) {
            dur_h = 24 + (en_h - st_h);
        }
        dur_m = en_m - st_m;

        if (dur_m < 0) {
            dur_m = 60 + (en_m - st_m);
            dur_h--;
        }

        if (st_h == en_h && st_m == en_m) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + dur_h + " HORA(S) E " + dur_m + " MINUTO(S)");
        }

    }

}
