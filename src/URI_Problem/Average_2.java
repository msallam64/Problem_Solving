package URI_Problem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average_2 {

    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.0");
        Scanner input = new Scanner(System.in);
        double A, B, C;
        A = input.nextDouble()*2;
        B = input.nextDouble()*3;
        C = input.nextDouble()*5;
        double MEDIA=(A+B+C)/10;
        String a=df.format(MEDIA);
        System.out.println("MEDIA = "+a);
    }

}
