package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        
        int contPar = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o numero inteiro  da posição " + (i + 1));
            A[i] = scan.nextInt();

            if (A[i] % 2 == 0) {
                contPar += 1;
            }

        }
        System.out.println("O vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" " + A[i]);

        }

        System.out.println("\nA quantidade de numeros para foi de " + contPar);

    }
}
