
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer02 {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);

    
        //criando um vetor 
        int[] a = new int[8];
        int[] b = new int[8];
        //adicionando valores no vetor a e vetor b

        System.out.println("Preenchendo um vetor...");
        for (int i = 0; i < a.length; i++) {

            System.out.println("Digite o valor " + (i + 1));
            a[i] = scan.nextInt();
            
            b[i] = a[i] *2;

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
        System.out.println("");
    }
}

