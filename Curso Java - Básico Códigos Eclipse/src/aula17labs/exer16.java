package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer16 {

    public static void main(String[] args) {
        //serie de fibonacci
        
        int primeiroNum = 1;
        int segundoNum = 1;
        int proximo = 0;
        System.out.println("Criando a serie:");

        System.out.println(primeiroNum);
        System.out.println(segundoNum);

        while (proximo<500){
            proximo = primeiroNum + segundoNum;
            primeiroNum = segundoNum;
            segundoNum = proximo;
            System.out.println(proximo);
        }
        System.out.println("Fim da serie de Fibonacci");
    }

}
