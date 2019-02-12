
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer27 {

       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        //char[] b = new char[a.length];
        int[] b = new int[a.length];

        System.out.println("Adicionando valores no vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite um numero da posição " + (i + 1));
            a[i] = scan.nextInt();

        }
        /*System.out.println("\nAdicionando valores no vetor B: ");
        for (int i = 0; i < a.length; i++) {
        System.out.println("Digite um numero da posição " + (i + 1));
        b[i] = scan.nextInt();
        }*/

        

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 7) {
                b[i] = 'a';
            } else if (a[i] == 7) {
                b[i] = 'b';
            } else if (a[i] >7 && a[i] < 10) {
                b[i] = 'c';
            } else if (a[i] == 10) {
                b[i] = 'd';
            } else if (a[i] > 10) {
                b[i] = 'e';
            }
            
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("  " + a[i]);
        }
        System.out.print("\nVetor B: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("  " + b[i]);
        }
        /*System.out.print("\nVetor C: ");
        for (int i = 0; i < a.length; i++) {
        System.out.print("  " + c[i]);
        }*/
        System.out.println("");

    }
}
