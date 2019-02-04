package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de temperaturas: ");
        int quantidadeTemp = scan.nextInt();

        double temp = 0;
        double somaTemp = 0;
        double menorTemp = Double.MAX_VALUE;//setando o maior valor e logo o menor valor
        double maiorTemp = Double.MIN_VALUE;

        for (int i = 1; i <= quantidadeTemp; i++) {
            System.out.println("Digite a temperatura " + i);
            temp = scan.nextDouble();
            somaTemp += temp;

            if (temp < menorTemp) {
                menorTemp = temp;
            }
            if (temp > maiorTemp) {
                maiorTemp = temp;
            }
        }

        System.out.println("Media de temperatura " + (somaTemp / quantidadeTemp));
        System.out.println("Menor Temperatura " + menorTemp);
        System.out.println("Maior Temperatura " + maiorTemp);
    }

}
