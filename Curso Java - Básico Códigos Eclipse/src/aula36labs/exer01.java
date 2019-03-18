package aula36labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da Agenda: ");
        String nome = scan.next();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Entre com as informações do contato " + (i + 1));
            Contato c = new Contato();
            System.out.println("Entre com o nome: ");
            nome = scan.next();
            System.out.println("Entre com telefone: ");
            String telefone = scan.next();
            System.out.println("Entre com email: ");
            String email = scan.next();
            c.setNome(nome);
            c.setTelefone(telefone);
            c.setEmail(email);
            //adicionando o objeto no vetor
            contatos[i] = c;

        }

        //adicionando todos os valores no vetor
        agenda.setContatos(contatos);
        //obtendo os valores
        if (agenda != null) {
            System.out.println(agenda.obterInfo());

        }
    }

}
