package aula15labs;

import java.util.Scanner;

/*
 *
 * @author Islane dos S. Silva
 */
public class exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo numero:");
        double n2 = scan.nextDouble();
        System.out.println("Digite o terceiro numero:");
        double n3 = scan.nextDouble();
      
        if (n1>= n2 && n1>= n3){
            System.out.println("O primeiro numero digitado é o maior.");
        }else if (n2>= n1 && n2>= n3){
            System.out.println("O segundo numero é o maior");
        }else if (n3>= n1 && n3>= n2) {
            System.out.println("O terceiro é o maior numero digitado");
        }
        
    }
        
}
