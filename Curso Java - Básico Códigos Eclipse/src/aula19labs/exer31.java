package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer31 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //exemplo de impressao de um vetro com pos primeiros elementos pares seguidos dos impares
        int[] a = new int[20];
        int[] b = new int[a.length];
        int posB = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o elemento da posicao " + (i + 1));
            a[i] = scan.nextInt();

        }
        //separando o vetor A
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[posB] = a[i];
                posB++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                b[posB] = a[i];
                posB++;
            }
        }
        //impressao dos vetores
        System.out.println("Vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("  " + a[i]);
        }
        System.out.println("\nVetor b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("  " + b[i]);
        }
        System.out.println("");

    }
}
