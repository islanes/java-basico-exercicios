
package aula15labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer18 {

     public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É um numero par.");
        } else {
            System.out.println("É um numero impar.");
        }
    }
}
