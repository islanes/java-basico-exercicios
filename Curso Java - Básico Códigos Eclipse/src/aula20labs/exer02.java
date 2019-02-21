package aula20labs;

import java.util.Random;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer02 {

    public static void main(String[] args) {

        int[][] numAleatorios = new int[10][10];
        Random numRandom = new Random();

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                numAleatorios[i][j] = numRandom.nextInt(9);//gerando num aletorios ate 9
            }
        }
        //verificando o maior valor da matriz
        int maior5 = Integer.MIN_VALUE;
        int menor5 = Integer.MAX_VALUE;
        int linha5 = 5;
        
        System.out.println("------ Matriz ------");
        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {

                System.out.print("| " + numAleatorios[i][j] + " ");

            }
            System.out.println("");
        }

        for (int i = 0; i < numAleatorios[linha5].length; i++) {
            if (numAleatorios[linha5][i] > maior5) {
                maior5 = numAleatorios[linha5][i];
            }
            if (numAleatorios[linha5][i] < menor5) {
                menor5 = numAleatorios[linha5][i];

            }

        }

        System.out.println("O maior da linha 5 é " + maior5);
        System.out.println("O menor é  " + menor5);

        int maior7 = 0;
        int menor7 = Integer.MAX_VALUE;;
        int col7 = 7;
        
        for (int i = 0; i < numAleatorios.length; i++) {
            
            if (numAleatorios[i][col7] > maior7) {
                maior7 = numAleatorios[i][col7];
            }
            if (numAleatorios[linha5][i] < menor7) {
                menor7 = numAleatorios[i][col7];

            }

        }
        System.out.println("O maior da coluna 7 é " + maior7);
        System.out.println("O menor é  " + menor7);
        
    }
}
