package URI_Problem;

import java.util.Scanner;

public class Age_in_Days {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, years, month, day;
        d = sc.nextInt();
        years = d / 365;
        d = d - (years * 365);
        month = d / 30;
        day = d - (month * 30);
        System.out.println(years + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(day + " dia(s)");
    }
}
