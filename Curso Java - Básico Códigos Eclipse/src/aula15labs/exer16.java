
package aula15labs;
import   java.util.Scanner;
    
/**
 *
 * @author Islane dos S. Silva
 */
public class exer16 {
    public static void main(String[] args) {
            //raizes de uma equação
    Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Entre com o valor de a:");
        int a = scan.nextInt();
        if(a == 0){
            System.out.println("Não é uma equação do segundo grau.");
           
        }
        System.out.println("Entre com o valor de b:");
        int b = scan.nextInt();
        System.out.println("Entre com o valor de c:");
        int c = scan.nextInt();
        double delta = (b * b) - (4* a *c) ;
        
        if(delta<0){
            System.out.println("Delta negativo.");
        }else {
            System.out.println("o delta é "+delta);
            double x1 = (-b + Math.sqrt(delta))/ (2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
            
        }
        
    }
}
