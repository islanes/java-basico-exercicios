
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //imprimindo os valores invertidos de um vetor:
        int[] a = new int[10];
        int[] b = new int[a.length];

        System.out.println("Adicionando valores no vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite um numero da posição " + (i + 1));
            a[i] = scan.nextInt();

        }
        
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length -1 -i];
            
        }

        //imprimindo o vetor A invertido 
        System.out.print("Vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("  " + a[i]);
        }
        System.out.print("\nVetor B: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("  " + b[i]);
        }
        
        System.out.println("");

    }

}
