package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lojas ---");

        System.out.println("");

        double total = 0;
        double preco = 0;
        boolean sair = false;
        String continuar;
        int quantidadeProd;
        String output;
        double valorPago;
        double troco;

        do {

            System.out.println("Deseja informar uma nova compra? S/N ");
            continuar = scan.next();
            if (continuar.equalsIgnoreCase("S")) {

                output = "Loja ---\n";

                System.out.println("Digite a quantidade de produtos: ");
                quantidadeProd = scan.nextInt();
                total = 0;
                for (int i = 1; i <= quantidadeProd; i++) {
                    System.out.println("Informe o preco do produto " + i);
                    preco = scan.nextDouble();

                    output += "Produto " + 1 + " :R$ " + preco + "\n";

                    total += preco;

                }
                output += "Total R$" + total + "\n";
                System.out.println("Total R$" + total);
                
                System.out.println("Entre com o valor Pago");
                valorPago = scan.nextDouble();

                output += "Dinheiro: R$" + valorPago + "\n";
                troco = valorPago - total;

                output += "Troco R$" + troco;
                System.out.println(output);
            } else {
                sair = true;
            }

        } while (!sair);

    }
}
