
package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer15 {
    public static void main(String[] args) {
        //serie de fibonacci
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o n-esimo termo da serie fibonacci: ");
        int termo = scan.nextInt();
        
        int primeiroNum = 1;
        int segundoNum = 1;
        int proximo;
        System.out.println("Criando a serie:");
        
        System.out.println(primeiroNum);
        System.out.println(segundoNum);
        
        for (int i = 3; i <= termo; i++) {
        
            proximo = primeiroNum + segundoNum;
            primeiroNum = segundoNum;
            segundoNum = proximo;
            System.out.println(proximo);
        }System.out.println("Fim da serie de Fibonacci");
    }
}
