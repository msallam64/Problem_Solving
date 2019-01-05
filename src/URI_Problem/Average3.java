package URI_Problem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Average3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double n1, n2, n3, n4;
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();
        n4 = in.nextDouble();
        double media = (((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10);
        String a = df.format(media);
        System.out.println("Media: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: ");
            double n5 = in.nextDouble();
            double m2 = (media + n5) / 2;
            if (m2 >= 5) {
                System.out.println("Media: " + media);
                System.out.println("Aluno em exame.");
                System.out.println("Nota do exame:" + n5);
                System.out.println("Aluno aprovado.");
                System.out.println("Media final:" + m2);
            } else {
                System.out.println("Media: " + media);
                System.out.println("Aluno em exame.");
                System.out.println("Nota do exame: " + n5);
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + m2);
            }
        }

    }

}
