package aula19labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //criando um vetor 
        int[] a = new int[15];
        double [] b = new double[15];
        //adicionando valores no vetor a e vetor b

        System.out.println("Um vetor ao ao quadrado...");
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        for (int i = 0; i < a.length; i++) {

            System.out.println("Digite o valor " + (i + 1));
            a[i] = scan.nextInt();
            b[i] = Math.sqrt(a[i]);//raiz quadrada.

        }

        //imprimindo o vetor a
        System.out.println("\nValor do vetor A:");
        for (int i = 0; i < a.length; i++) {

            System.out.print(" " + a[i]);
        }
        //imprimindo o vetor b

        System.out.println("\nRaiz quadrada do vetor A:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + format.format(b[i]));
        }
        System.out.println("");
    }

}
