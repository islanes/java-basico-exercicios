package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        double media = 0;
        int cont = 0;
        int soma = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o numero da posição " + (i + 1));
            a[i] = scan.nextInt();

        }
        //contando os valores impares e realizando soma dos vaores 
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                cont += 1;
                soma += a[i];

            }
        }

        media = soma / cont;
        System.out.println("A media dos valores impares foi " + media);
    }

}
