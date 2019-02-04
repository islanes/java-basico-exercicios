
package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer22 {
    public static void main(String[] args) {
        //valor total investido por um colecionador 
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o numero de CDs: ");
        int cd = scan.nextInt();
        double preco = 0;
        double soma = 0;
        double media = 0;
        
        for (int i = 1; i < cd; i++) {
         
            System.out.println("Digite o valor do cd "+i);
            preco = scan.nextDouble();
            soma += preco;
        }
        media = soma / cd;
        
        System.out.println("A media investida em cada CD é "+media);
        
    }
}
