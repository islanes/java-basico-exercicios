package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("");

        //flag 
        boolean naoTerminar = true;
        int cod, quant;
        double total = 0;
        String output = "";

        do {
            System.out.println("Digite o codigo e a quantidade. Digite 0 para sair.");
            cod = scan.nextInt();
            quant = scan.nextInt();

            if (cod == 0 && quant == 0) {
                naoTerminar = false;
                System.out.println("Total a pagar R$"+total);
            } else {
                if (cod == 100) {
                    output += "Cachorro Quente - R$ 1,20 - " + quant;
                    output += " - " + (1.20 * quant) + "\n";
                    total += (1.20 * quant);
                } else if (cod == 101) {
                    output += "Bauru Simples - R$ 1,30 - " + quant;
                    output += " - " + (1.30 * quant) + "\n";
                    total += (1.30 * quant);
                } else if (cod == 102) {
                    output += "Bauru com Ovo - R$ 1,50 - " + quant;
                    output += " - " + (1.50 * quant) + "\n";
                    total += (1.50 * quant);
                } else if (cod == 103) {
                    output += "Hamburguer - R$ 1,20 - " + quant;
                    output += " - " + (1.20 * quant) + "\n";
                    total += (1.20 * quant);
                } else if (cod == 104) {
                    output += "Cheeseburguer - R$ 1,30 - " + quant;
                    output += " - " + (1.30 * quant) + "\n";
                    total += (1.30 * quant);
                } else if (cod == 105) {
                    output += "Refri - R$ 1 - " + quant;
                    output += " - " + (1 * quant) + "\n";
                    total += (1 * quant);
                }
            }
        } while (naoTerminar);
        System.out.println(output);
    }
}
