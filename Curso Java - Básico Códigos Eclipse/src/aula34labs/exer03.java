package aula34labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer03 {

    static void imprimir(int num) {
        System.out.println("" + num);
    }

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

        
        imprimir(Calculadora.fat(num));
    }
}
