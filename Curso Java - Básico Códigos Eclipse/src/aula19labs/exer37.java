package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer37 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //fatorial
        int[] a = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Entre com o valor da posição " + (i + 1));
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            vetorB[i] = 1;
            for (int j = 1; j <= a[i]; j++) {
                vetorB[i] *= j;
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("  " + a[i]);
        }
        System.out.print("\nVetor B: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("  " + vetorB[i]);
        }

        System.out.println("");

    }
}
