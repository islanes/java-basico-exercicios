package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Promoção Açougue.");
        System.out.println("TIPO DE CARNE:");
        System.out.println(" 1 - file duplo");
        System.out.println(" 2 - alcatra");
        System.out.println(" 3 - picanha");
        int tipo = scan.nextInt();

        System.out.println("Digite a quantidade (kg):");
        double quantidade = scan.nextDouble();
        double precoKG = 0;

        if (tipo == 1) {
            System.out.println(quantidade + " kg - file duplo");
            if (quantidade < 5) {
                precoKG = 4.9;

            } else {
                precoKG = 5.8;
            }
        } else if (tipo == 2) {
            System.out.println(quantidade + " kg - alcatra");
            if (quantidade < 5) {
                precoKG = 5.9;

            } else {
                precoKG = 6.8;
            }
            System.out.println("");
        } else if (tipo == 3) {
            System.out.println(quantidade + " kg - picanha");
            if (quantidade < 5) {
                precoKG = 6.9;

            } else {
                precoKG = 7.8;
            }
        }
        double total = quantidade * precoKG;
        System.out.println("Quantidade kg " + quantidade + "\nPreço kg- R$"+precoKG+"\nPreço Total R$" + total);

        System.out.println("Compra no cartão digite 1");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;

            System.out.println("Desconto obtido: R$" + desconto);
            System.out.println("Total a pagar R$" + (total - desconto));
        } else {
            System.out.println("Total a pagar R$" + total);
        }

    }
}
