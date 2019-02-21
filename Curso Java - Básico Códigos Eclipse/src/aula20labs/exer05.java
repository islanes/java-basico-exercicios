package aula20labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8];

        boolean sair = false;
        byte opcao;
        int dia = 0;
        boolean diaValido = false;
        boolean horaValido = false;
        int hora = 0;
        int mes = 0;
        boolean mesValido = false;

        while (!sair) {

            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            opcao = scan.nextByte();

            if (opcao == 1) {

                mesValido = false;
                while (!mesValido) {
                    
                    System.out.println("Entre com o mes: ");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido...");
                    }

                }

                diaValido = false;
                while (!diaValido) {

                    //adicionar compromisso 
                    System.out.println("Entre com o dia do mes: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido...");
                    }

                }

                horaValido = false;
                while (!horaValido) {

                    //adicionar compromisso 
                    System.out.println("Entre com a hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora invalida digite novamente...");
                    }

                }
                //se trata de um vetor nele começa com zero logo devemos arrumar para começar com 1
                mes--;
                dia--;//acessando o dia 
                hora --;
                System.out.println("Digite o compromisso: ");
                compromissos[mes][dia][hora] = scan.next();
                ///fim de adicionar
            } else if (opcao == 2) {

                mesValido = false;

                while (!mesValido) {
                    //adicionar compromisso 
                    System.out.println("Entre com o mes: ");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido...");
                    }

                }

                diaValido = false;

                while (!diaValido) {

                    //adicionar compromisso 
                    System.out.println("Entre com o dia do mes: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido...");
                    }

                }

                horaValido = false;
                while (!horaValido) {

                    //adicionar compromisso 
                    System.out.println("Entre com a hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora invalida digite novamente...");
                    }

                }

                //imprimindo um compromisso 
                mes--;
                dia--;
                hora --;
                System.out.println("O compromisso agendado é ");
                System.out.println(compromissos[mes][dia][hora] + "\n");

            } else if (opcao == 0) {
                sair = true;
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção invalida");
            }

        }

    }

}
