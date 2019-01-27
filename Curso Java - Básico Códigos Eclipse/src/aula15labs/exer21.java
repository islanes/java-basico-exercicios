
package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer21 {
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Descontos sobre o combustivel.");

        System.out.println("Digite a quantidade de litros vendido:");
        double litros = scan.nextDouble();
        
        System.out.println("Digite o tipo de combustivel:\nG - Gasolina\nA - Alcool:");
        String TipoCombustivel = scan.next();

        double valorAlcool = 1.90;
        double valorGasolina = 2.50;
        double valorTotal = 0;
        double totalDesconto = 0;
        int percentualDesconto = 0;
        double pagar = 0;
        
        if(TipoCombustivel.equalsIgnoreCase("A")){
            if (litros <= 20) {
               percentualDesconto = 3;
            }else {
                percentualDesconto = 5;
            } valorTotal = litros * valorAlcool;
        }      
            else if (TipoCombustivel.equalsIgnoreCase("G")){
             if (litros <= 20) {
               percentualDesconto = 4;
            }else {
                percentualDesconto = 6;
            }valorTotal = litros * valorGasolina;
        }
        
        totalDesconto = (valorTotal/100) * percentualDesconto;
        pagar = valorTotal - totalDesconto;
        
           System.out.println("Total sem Desconto R$"+valorTotal+"\nTotal a pagar R$"+pagar+"\nPercentual de Desconto "+percentualDesconto+"%\nTotal de Desconto R$"+totalDesconto);
    }
}
