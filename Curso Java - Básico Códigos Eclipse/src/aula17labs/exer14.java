package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            num = scan.nextInt();

            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }

        } System.out.println("Total de numeros pares digitados: "+contPar);
        System.out.println("Total de numeros impares digitados: "+contImpar);

    }

}
