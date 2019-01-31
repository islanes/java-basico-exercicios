
package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer13 {
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor da base: ");
        int base = scan.nextInt();        
        
        System.out.println("Digite o valor do expoente: ");
        int pot = scan.nextInt();
        int resultado = base;
              
        for (int i = 1; i < pot; i++) {
            
            resultado += base;
            
        }
        System.out.println("O Expoente é "+resultado);
                
    }

}
