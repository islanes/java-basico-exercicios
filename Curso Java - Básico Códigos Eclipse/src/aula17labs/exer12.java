
package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero para gerar a tabuada: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
