package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de idades: ");
        int idades = scan.nextInt();

        double soma = 0;
        double media = 0;
        double idade = 0;

        for (int i = 1; i <= idades; i++) {
            System.out.println("Entre com a idade da pessoa: " + i);
            idade = scan.nextDouble();
            soma += idade;
        }
        media = soma / idades;

        System.out.println("A media de idade foi " + media);
        
        if (media >= 0 && media <= 25) {
            System.out.println("JOVEM");
        } else if (media >= 26 && media <= 60) {
            System.out.println("ADULTA");
        } else if (media > 60) {
            System.out.println("IDOSA");
        }

    }
}
