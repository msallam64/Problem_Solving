package URI_Problem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int EmployeeNumber = input.nextInt();
        int Hours_per_Month = input.nextInt();
        double Amount_Per_Hours = input.nextDouble();
        System.out.println("NUMBER = " + EmployeeNumber);
        double salary = (Hours_per_Month * Amount_Per_Hours);
        String a = df.format(salary);
        System.out.println("SALARY = U$ " + a);

    }

}
