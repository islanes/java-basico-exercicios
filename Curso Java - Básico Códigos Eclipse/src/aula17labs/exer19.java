package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o numero de notas: ");
        int notas = scan.nextInt();

        double soma = 0;
        double media = 0;
        double nota = 0;

        for (int i = 1; i <= notas; i++) {
            System.out.println("Entre com a nota: " + i);
            nota = scan.nextDouble();
            soma += nota;
        }
        media = soma/notas;
        System.out.println("A soma foi " + soma);
        System.out.println("A media é "+ media);
    }

}
