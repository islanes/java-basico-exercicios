package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //realizando a soma de elementos multiplos de 5
        int[] a = new int[10];
        int soma = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o numero da posição " +(i + 1));
            a[i] = scan.nextInt();

        }
        System.out.println("Os elementos do Vetor A são: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(" | "+ a[i]);
            if (a[i] % 5 == 0) {
                soma += a[i];
            }
        }
        System.out.println("A soma dos elementos multiplos de 5 é " + soma);

    }
}
