package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String sexo ;
        String EstadoCivil;

        do {
            System.out.println("Digite seu nome: ");
            nome = scan.next();

            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("O nome precisa de no minimo 3 caracteres");
            }

        } while (!infoValida);//negativo de true é falso

        infoValida = false;

        do {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            if (idade > 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150");
            }

        } while (!infoValida);//negativo de true é falso

        infoValida = false;

        do {
            System.out.println("Digite seu salario: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salrio deve ser maior que 0");
            }

        } while (!infoValida);//negativo de true é falso]
        
        infoValida = false;

        do {
            System.out.println("Digite seu sexo: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
                infoValida = true;
            } else {
                System.out.println("O sexo deve ser M ou F.");
            }

        } while (!infoValida);//negativo de true é falso
        
        infoValida = false;

        do {
            System.out.println("Digite seu Estado Civil: ");
            EstadoCivil = scan.next();

            if (EstadoCivil.equalsIgnoreCase("S") || EstadoCivil.equalsIgnoreCase("C") || EstadoCivil.equalsIgnoreCase("v") || EstadoCivil.equalsIgnoreCase("D")) {
                infoValida = true;
            } else {
                System.out.println("O Estado Civil deve ser S - Solteiro C - Casado D - Divorciado  V - Viuvo.");
            }

        } while (!infoValida);//negativo de true é falso
        System.out.println("Seus dados: ");
        System.out.println("Seu nome "+ nome);
        System.out.println("Sua idade  "+ idade);
        System.out.println("Seu Salario  "+ salario);
        System.out.println("Seu sexo "+ sexo);
        System.out.println("Seu estado civil "+ EstadoCivil);
        
        
        
        
    }

}
