package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de turmas: ");
        int turmas = scan.nextInt();

        int alunos = 0;
        int soma = 0;
        double media = 0;
        boolean invalido = true;

        for (int i = 1; i <= turmas; i++) {
            invalido = true;
            do {
                System.out.println("Entre com o numero de alunos da turma " + i);
                alunos = scan.nextInt();

                if (alunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Numero invalido de alunos nesta turma.");
                }

            } while (invalido);
            soma += alunos;
        }
        media = soma / turmas;
        System.out.println("Media " + media);
    }
}
