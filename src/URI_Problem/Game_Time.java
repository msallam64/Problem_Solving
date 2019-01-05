package URI_Problem;

import java.util.Scanner;

public class Game_Time {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int en, st, dur;
        st = in.nextInt();
        en = in.nextInt();
        dur = en - st;
        if (dur < 0) {
            dur = 24 + (en - st);
        }
        if (st == en) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.println("O JOGO DUROU "+dur+" HORA(S)");
        }

    }

}
