package aula19labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //criando um vetor 
        int[] a = new int[5];
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        System.out.println("Adicionando valores no vetor A:");

        DecimalFormat format = new DecimalFormat("###,###.##");
        for (int i = 0; i < a.length; i++) {

            System.out.println("Digite o valor " + (i + 1));
            a[i] = scan.nextInt();

        }
        System.out.println("Adicionando valores no vetor B:");

        for (int i = 0; i < b.length; i++) {

            System.out.println("Digite o valor " + (i + 1));
            b[i] = scan.nextInt();

        }

        //imprimindo o vetor a
        System.out.println("\nValor do vetor A:");
        for (int i = 0; i < a.length; i++) {

            System.out.print(" " + a[i]);
        }
        //imprimindo o vetor b
        System.out.println("\nValor do vetor B:");
        for (int i = 0; i < b.length; i++) {

            System.out.print(" " + b[i]);
        }
        //imprimindo o vetor C 

        System.out.println("\nAdicionando a soma dos vetores A e B no vetor C:");
        for (int i = 0; i < c.length; i++) {
            c[i] = (a[i] + b[i]);
            System.out.print(" " + format.format(c[i]));
        }
        System.out.println("");
    }
}
