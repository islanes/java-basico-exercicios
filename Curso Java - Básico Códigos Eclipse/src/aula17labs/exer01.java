package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //verificando se uma nota esta entre 0 e 10 caso não ocorrerar a repeticao 
        //da digitacao da nota 
        System.out.println("Digite uma nota: ");
        double nota = scan.nextDouble();
        //flag de confirmação de nota válida:
        boolean notaOK = false;

        do {
            if (nota >= 0 && nota <= 10) {
                notaOK = true;
                System.out.println("Sua nota é " + nota);
            } else {
                //notaOK = false;
                System.out.println("Digite uma nota válida.");
                System.out.println("Digite uma nota: ");
                nota = scan.nextDouble();
            }
        } while (!notaOK);//verificando o flag 
    }

}
