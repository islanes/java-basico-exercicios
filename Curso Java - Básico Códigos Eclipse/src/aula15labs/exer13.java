package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia da semana:");
        int dia = scan.nextInt();
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } else if (dia == 3) {
            System.out.println("Terça");
        } else if (dia == 4) {
            System.out.println("Quarta");
        } else if (dia == 5) {
            System.out.println("Quinta");
        } else if (dia == 6) {
            System.out.println("Sexta");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Digito incorreto");
        }

    }
}
