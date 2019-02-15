
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer35 {

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];

        //dividores pelo vetor a
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o elemento da posicao " + (i + 1));
            a[i] = scan.nextInt();
        }

        //
        for (int i = 0; i < a.length; i++) {

            System.out.println("Analizando o número "+a[i]);
            for (int j = 1; j < a[i]; j++) {
                if (a[i] % j == 0) {

                    System.out.println(j+" é Divisor.");
                }
            }
        }

        System.out.println(" ");
    }
}
