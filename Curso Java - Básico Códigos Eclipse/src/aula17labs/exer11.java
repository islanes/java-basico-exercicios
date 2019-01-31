package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo numero ");
        int numero2 = scan.nextInt();

        int soma = 0;
        System.out.println("-----------------------------------------");
        //imprimindo os valores dentro do intervalo digitado
        for (int i = numero1; i <= numero2; i++) {
            //System.out.println(i);
            soma += i;
        }
        System.out.println("A soma do intervalo é "+soma);
    }

}
