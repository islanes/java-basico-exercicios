package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Perguntas sobre um CRIME: ");

        System.out.println("Telefonou para a vítima?");
        String resposta1 = scan.next();
        System.out.println("Esteve no local do crime?");
        String resposta2 = scan.next();
        System.out.println("Mora perto da vitima? ");
        String resposta3 = scan.next();
        System.out.println("Devia para a vítima?");
        String resposta4 = scan.next();
        System.out.println("Já trabalhou com a vítima?");
        String resposta5 = scan.next();

        int cont = 0;

        if (resposta1.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resposta2.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resposta3.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resposta4.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resposta5.equalsIgnoreCase("S")) {
            cont++;
        }

        if (cont == 0) {
            System.out.println("INOCENTE");
        } else if (cont == 2) {
            System.out.println("SUSPEITA");
        } else if (cont == 3 || cont == 4) {
            System.out.println("CUMPLICE");
        } else if (cont == 5) {
            System.out.println("ASSASINO");
        }

    }
}
