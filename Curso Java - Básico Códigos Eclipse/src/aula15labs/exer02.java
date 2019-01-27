package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer02 {
    //verificando se o valor é positivo ou negativo//
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um valor para verificar se o mesmo é POSITIVO ou NEGATIVO: ");
        double valor = scan.nextDouble();
        
        if(valor <= 0 ){
            System.out.println("O valor é NEGATIVO.");
        }else {
            System.out.println("O valor é POSITIVO.");
        }
    }
}
