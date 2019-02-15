package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[20];
        int[] b = new int[20];
        int[] c = new int[20];

        System.out.println("Adicionando valores no vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o valor da posição " + (i + 1));
            a[i] = scan.nextInt();

        }

        //flags
        int posiB = 0;
        int posiC = 0;
        
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                b[posiB] = a[i];
                posiB ++;
            } else {
                c[posiC] = a[i];
                posiC++;
            }
        }
        //imprimindo o s vetores
       

        System.out.println("Vetor A");
        for (int i = 0; i < a.length; i++) {

            System.out.print("  " + a[i]);
        }

        System.out.println("\nVetor B");
        for (int i = 0; i < posiB; i++) {

            System.out.print("  " + b[i]);
        }

        System.out.println("\nVetor C");
        for (int i = 0; i < posiC; i++) {

            System.out.print("  " + c[i]);
        }
        System.out.println("");

    }

}
