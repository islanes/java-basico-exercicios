package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**~~****~~** Lojas Quase Dois **~~****~~**\n----- Tabela de Preços -----");
        //tabela de preços da loja
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$ " + (1.99 * i));
        }
        for (int i = 0; i < 15; i++) {
            System.out.print("*~~*");
            
        }System.out.println("");

    }
}
