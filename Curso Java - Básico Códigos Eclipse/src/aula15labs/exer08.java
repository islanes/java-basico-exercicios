
package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer08 {
    //verificando o menor preço de um produto
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro preço do produto:");
        double p1 = scan.nextDouble();
        System.out.println("Digite o segundo preço do produto:");
        double p2 = scan.nextDouble();
        System.out.println("Digite o terceiro preço do produto:");
        double p3 = scan.nextDouble();
      
        
        //verificando o menor
        if (p1<= p2 && p1<= p3){
            System.out.println("O primeiro preço é mais barato R$"+p1);
        }else if (p2<= p1 && p2<= p3){
            System.out.println("O segundo preço é mais barato R$"+p2);
        }else if (p3<= p1 && p3<= p2) {
            System.out.println("O terceiro é preço é mais barato R$"+p3);
        }
       }
}
