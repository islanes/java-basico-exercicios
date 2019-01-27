package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer01 {
    
    public static void main(String[] args) {
        //verificando um numero se é maior que o outro//
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        double n1 = scan.nextDouble();
        System.out.println("Digite outro numero");
        double n2 = scan.nextDouble();
        
        if (n1>n2){
            System.out.println("O primeiro número é maior que o segundo.");
        }else {
            System.out.println("O segundo número é maior que o primeiro.");
        }
        
    }
}
