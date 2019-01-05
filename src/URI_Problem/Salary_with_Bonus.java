package URI_Problem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary_with_Bonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String Seller_name = input.nextLine();
        double Fixed_Salary = input.nextDouble();
        double Salles_per_Month = input.nextDouble();
        double Salary=Salles_per_Month*15/(100);
        double Total = Salary + Fixed_Salary;
        String a = df.format(Total);
        System.out.println("TOTAL = R$ " + a);
    }

}
