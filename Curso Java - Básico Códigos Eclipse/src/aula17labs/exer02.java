package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //verificando se o nome do usuario é igual a senha...

        //flag de confirmação de senha/usuario
        boolean senhaOK = false;
        //boa pratica declarar as variaveis fora do loop
        String nomeUser ;
        String senhaUser;

        do {
            System.out.println("Digite seu nome: ");
            nomeUser = scan.next();
            System.out.println("Digite sua senha: ");
            senhaUser = scan.next();

            if (nomeUser.equalsIgnoreCase(senhaUser)) {

                System.out.println("Sua senha igual ao nome do usuario!!");

            } else {
                senhaOK = true;
                //notaOK = false;
                System.out.println("Senha ok.");

            }
        } while (!senhaOK);//verificando o flag 

    }
}
