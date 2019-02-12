
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite um numero da posição " + (i + 1));
            a[i] = scan.nextInt();
            if (a[i] % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }

        System.out.println("Respectivamente os vetores A e B:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + b[i]);
        }

    }
}
