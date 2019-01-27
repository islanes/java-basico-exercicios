package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo número:");
        double n2 = scan.nextDouble();
        System.out.println("Digite o terceiro número:");
        double n3 = scan.nextDouble();
        //
        if (n1 <= n2 && n1 <= n3 && n2 <= n3) {
            System.out.println(n3 + " - " + n2 + " - " + n1);
        } else if (n1 <= n2 && n1 <= n3 && n3 <= n2) {
            System.out.println(n2 + " - " + n3 + " - " + n1);

        }//o numero dois é o menor
        else if (n2 <= n1 && n2 <= n3 && n1 <= n3) {
            System.out.println(n3 + " - " + n1 + " - " + n2);
        } else if (n2 <= n1 && n2 <= n3 && n3 <= n1) {
            System.out.println(n1 + " - " + n3 + " - " + n2);

        } //o numero tres é o menor
        else if (n3 <= n1 && n3 <= n2 && n1 <= n2) {
            System.out.println(n2 + " - " + n1 + " - " + n3);
        } else if (n3 <= n1 && n3 <= n2 && n2 <= n1) {
            System.out.println(n1 + " - " + n3 + " - " + n2);
        }

    }
}
