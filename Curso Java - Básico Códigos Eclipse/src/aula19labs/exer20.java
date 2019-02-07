package aula19labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //cotação do dolar...
        double[] vetorA = new double[20];
        double cotacao;
        DecimalFormat format = new DecimalFormat("###,###.##");
       

        System.out.println("Entre com a cotacao do dolar: ");
        cotacao = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = cotacao * (i + 1);
        }
        System.out.println("\nCotação: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(" | " + format.format(vetorA[i]));
        }System.out.println("");
    }
}
