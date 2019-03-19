package aula50;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Entre com um numero decimal: ");

        try {
            double num = lerNumero();

            System.out.println("Voce digitou "+num);
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }
         
    }

    public static double lerNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
