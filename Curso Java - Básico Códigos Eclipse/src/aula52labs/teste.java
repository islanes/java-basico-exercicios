package aula52labs;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Islane dos S. Silva
 */
public class teste {

    public static void main(String[] args) {
        /*        Contato c1= new Contato();
        c1.setEmail("email");
        c1.setNome("NOME");
        System.out.println(c1);*/

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        //System.out.println("aula52labs.teste.main()");
        int opcao = 1;
        while (opcao != 3) {
            opcao = ObterOpcaoMenu(scan);

            if (opcao == 1) {
                //consulta contato
                consultarContato(scan, agenda);
            } else if (opcao == 2) {
                //Adicionar contato
                adicionarContato(scan, agenda);
            } else if (opcao == 3) {
                System.out.println("Saiu do sistema.");
                System.exit(0);
            }

        }

    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        try {
            System.out.println("Criando um contato entre com as informações");
            String nome = leInformacao(scan, "Entre com o nome do contato: ");
            String telefone = leInformacao(scan, "Entre com o telefone do contato: ");
            String email = leInformacao(scan, "Entre com o email do contato: ");

            Contato c = new Contato();
            c.setNome(nome);
            c.setEmail(email);
            c.setTelefone(telefone);

            System.out.println("Contato criado");
            System.out.println(c);

            agenda.AdicionarContato(c);
        } catch (AgendaCheiaException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }

    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = leInformacao(scan, "Entre com o nome do contato a ser pesquisado");
        try {
            if (agenda.ConsultaContato(nomeContato) >= 0) {
                System.out.println("Contato Existe.");
                System.out.println(nomeContato.toString());

            }
        } catch (ContatoNaoExiste ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String leInformacao(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.next();
        return entrada;
    }

    public static int ObterOpcaoMenu(Scanner scan) {

        boolean entrada = false;
        int op = 3;
        while (!entrada) {
            System.out.println("Digite a opção desejada:\n"
                    + "1- Consultar contato"
                    + "\n2- Adicionar Contato"
                    + "\n3- Sair");
            try {

                String ent = scan.next();
                op = Integer.parseInt(ent);

                if (op == 1 || op == 2 || op == 3) {
                    //
                    entrada = true;
                } else {
                    throw new Exception("Entrada invalida.");

                }
            } catch (Exception e) {
                //generica
                System.out.println("Entrada invalida! Digite novamente\n");
            }

        }

        return op;

    }
}
