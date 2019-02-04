package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero para gerar uma lista de numeros primos. ");
        int num = scan.nextInt();
        System.out.println("----------------------------");

        boolean primo;
        for (int i = 1; i <= num; i++) {
            primo = true;
            //for anhinhado
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    //System.out.println("Nao e primo");
                    primo = false;
                }}
                if (primo) {
                    System.out.println(i);
                }
            
        }

        // System.out.println(i + " ");
    }
}
