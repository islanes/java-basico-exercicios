package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //criando um vetor aleatoriamente round com valores de 0 a 1
        int[] vetorA = new int[20];
        int qtd0 = 0;
        int qtd1 = 0;

        System.out.println("Gerando valores aletorios 0 e 1 e calculando o percentual dos mesmos no vetor.");
        for (int i = 0; i < 10; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);//gerando os valores 0 e 1
            System.out.print(" "+vetorA[i]);

            if (vetorA[i] == 0) {
                qtd0 += 1;
            } else if (vetorA[i] == 1) {
                qtd1 += 1;
            }
        }
        double per0 = (qtd0 * 100) / 10;//calculando o percentual de 0 e 1
        double per1 = (qtd1 * 100) / 10;
        System.out.println("\nO percentual de 0 é de " + per0 + "%");
        System.out.println("O percentual de 1 é de " + per1 + "%");
    }
}
