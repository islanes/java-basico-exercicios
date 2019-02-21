package aula20labs;

import java.util.Random;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer01 {

    public static void main(String[] args) {

        int[][] numAleatorios = new int[4][4];
        Random numRandom = new Random();

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                numAleatorios[i][j] = numRandom.nextInt(100);//gerando num aletorios ate 100
            }
        }
        //verificando o maior valor da matriz
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        System.out.println("------ Matriz ------");
        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {

                System.out.print("| "+numAleatorios[i][j] + " ");
                if (numAleatorios[i][j] > maior) {
                    maior = numAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }

            }
            System.out.println("");
        }
        System.out.println("O maior é " + maior);
        System.out.println("A linha " + linha);
        System.out.println("A coluna é " + coluna);

    }

}
