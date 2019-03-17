package aula35;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class testeCalculadoraFatorialRecursivo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        do {

            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            if (num < 0) {

                System.out.println("Digite um número positivo");

            }
        } while (num < 0);

        imprimir(Calculadora.fatorial(num));

    }

    static void imprimir(int num) {
        System.out.println("" + num);
    }

}
