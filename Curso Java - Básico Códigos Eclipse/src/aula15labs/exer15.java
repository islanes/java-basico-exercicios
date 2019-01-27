package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite primeiro lado do triângulo");
        int lado1 = scan.nextInt();
        System.out.println("Digite segundo lado do triângulo");
        int lado2 = scan.nextInt();
        System.out.println("Digite terceiro lado do triângulo");
        int lado3 = scan.nextInt();

        if ((lado1 + lado2 > lado3) || ((lado1 + lado3) > lado2) || ((lado3 + lado2) > lado1)) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo Equilatero ");
            } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                System.out.println("É um triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo Isóceles");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }

    }

}
