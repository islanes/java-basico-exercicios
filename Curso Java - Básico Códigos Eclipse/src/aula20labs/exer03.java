package aula20labs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] numDigitado = new int[3][3];

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < numDigitado.length; i++) {
            System.out.println("Linha "+ (i+1));
            for (int j = 0; j < numDigitado[i].length; j++) {
                System.out.println("Digite um valor para a posição "+(j+1));
                numDigitado[i][j] = scan.nextInt();//gerando num aletorios ate 9
            }
        }
        //imprimindo a matriz
        System.out.println("------ Matriz ------");
        for (int i = 0; i < numDigitado.length; i++) {
            for (int j = 0; j < numDigitado[i].length; j++) {

                System.out.print("| " + numDigitado[i][j] + " ");

                //contando oa numeros pares e impares
                if (numDigitado[i][j] % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
            System.out.println("");
        }
        System.out.println("Total de valores PARES "+contPar);
        System.out.println("Total de valores IMPARES "+contImpar);
        
    }
}

