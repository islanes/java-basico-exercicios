
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //idades de um grupo de pessoas 

        int[] a = new int[10];
        int contIdade = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite a idade da posição " + (i + 1));
            a[i] = scan.nextInt();

        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 35) {
                contIdade += 1;
                
            }
        }

        //imprimindo o vetor A
        for (int i = 0; i < a.length; i++) {
            System.out.print(" | "+ a[i]);
        }
       
        System.out.println("\nA quantidade de pesoas com idade igual ou maior a 35 anos é de: " + contIdade + " pessoas.");
        
    }
}
