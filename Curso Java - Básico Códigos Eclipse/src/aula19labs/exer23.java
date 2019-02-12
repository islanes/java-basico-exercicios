package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //verificando numeros pares
        int[] vetA = new int[10];
        boolean flag = false;

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Digite um numero inteiro para a posição: " + (i+1));
            vetA[i] = scan.nextInt();

            if (vetA[i] % 2 != 0) {//caso seja impar o processamento é parado
                break;
            }

        }
        //System.out.println("O vetor A");

        System.out.println("Fim do Processamento");

    }
}
