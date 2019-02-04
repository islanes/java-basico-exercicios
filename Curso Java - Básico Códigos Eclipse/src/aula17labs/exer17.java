package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer17 {

    public static void main(String[] args) {
        //fatorial
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero para o fatorial: ");
        int num = scan.nextInt();

        int fat = 1;
        System.out.print(num + "! = ");

        for (int i = num; i > 0; i--) {

            fat *= i;

            // System.out.println(i + " ");
        }
        System.out.println("" + fat);
    }
}
