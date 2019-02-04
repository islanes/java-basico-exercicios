package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero para descobrir se é primo ou nao: ");
        int num = scan.nextInt();

        boolean primo = true;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                System.out.println("Nao e primo");
                primo = false;
            }
        }

        // System.out.println(i + " ");
        if (primo) {
            System.out.println("E um numero primo");
        }

    }

}
