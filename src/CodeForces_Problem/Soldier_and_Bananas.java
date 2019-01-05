package CodeForces_Problem;

import java.util.Scanner;

public class Soldier_and_Bananas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Cost_Of_1Banana, Number_Dollars, Number_Banana_he_Want, Cost_Of_All_Banana = 0, Dollars_He_Nedded;
        Cost_Of_1Banana = in.nextInt();
        Number_Dollars = in.nextInt();
        Number_Banana_he_Want = in.nextInt();
        for (int i = 1; i <= Number_Banana_he_Want; i++) {
            Cost_Of_All_Banana = Cost_Of_All_Banana + (Cost_Of_1Banana * i);
        }
        if (Number_Dollars >= Cost_Of_All_Banana) {
            System.out.println("0");
        } else {
            Dollars_He_Nedded = Cost_Of_All_Banana - Number_Dollars;
            System.out.println(Dollars_He_Nedded);
        }

    }
}
