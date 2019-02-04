package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada diferente");

        System.out.println("Digite qual tabuada a ser impressa: ");
        int numero = scan.nextInt();

        int inicio;
        int fim;

        boolean invalido = true;
        do {

            System.out.println("Digite o inicio da tabuada: ");
            inicio = scan.nextInt();
            System.out.println("Digite o fim da tabuada: ");
            fim = scan.nextInt();

                if (fim < inicio) {
                    invalido = false;
                    System.out.println("");
                }else{
                    invalido = true;
                }

        } while (!invalido);
        
        System.out.println("Inicio da Tabuada "+inicio);
        System.out.println("Fim da Tabuada "+fim);
        System.out.println("Tabuada de " + numero);

        for (int i = inicio; i <= fim; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
