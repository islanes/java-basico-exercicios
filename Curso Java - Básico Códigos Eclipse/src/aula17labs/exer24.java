package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer24 {

    public static void main(String[] args) {
        
        System.out.println("**~~****~~** Padaria Pao de Ontem :) **~~****~~**\n----- Tabela de Preços dos Paes -----");
        //tabela de preços dos paes nesta padaria 
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$ " + (0.35 * i));
        }
        for (int i = 0; i < 15; i++) {
            System.out.print("*~~*");

        }
        System.out.println("");

    }
}
