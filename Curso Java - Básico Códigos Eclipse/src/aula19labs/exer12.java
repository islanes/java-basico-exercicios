package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //soma dos valores armazenados em um vetor:
        int[] A = new int[10];
        
        int Soma = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o numero inteiro da posição " + (i + 1));
            A[i] = scan.nextInt();

            Soma += A[i];//lendo e realizando a soma neste for mas pode ser em outro for
            }

        
        System.out.println("Os elementos do vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" | " + A[i]);

        }

        System.out.println("\nA Soma dos elementos do vetor A foi: " + Soma);

}
}
