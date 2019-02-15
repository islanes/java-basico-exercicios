
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] a = new int[5];
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o elemento da posicao "+(i+1));
            a[i] = scan.nextInt();
        }
        
            //imprimindo a tabuada dos elementos do vetor A
            for (int i = 0; i < a.length; i++) {
                System.out.println("Tabuada de "+a[i]);
                //calculo da tabuada
                for (int j = 1; j < 11; j++) {
                    System.out.println(j+" x "+a[i]+" = "+(a[i] * j) );
                }
        }
    }

}
