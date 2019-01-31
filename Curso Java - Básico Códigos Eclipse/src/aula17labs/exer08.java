package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        double media;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            soma += numero;
            
        }
        media = soma / 5;
        System.out.println("A Soma foi "+soma);
        System.out.println("Media foi "+media);
    }
}
