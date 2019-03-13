package aula27labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JogoVelha jv = new JogoVelha();

        System.out.println("O jogador 1 - O");
        System.out.println("O jogador 2 - X");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {

            if (jv.vezJogador1()) {
                System.out.println("Vez do jogador 1, escolha a linha e a coluna: ");
                sinal = 'O';
            } else {
                System.out.println("Vez do jogador 2, escolha a linha e a coluna: ");
                sinal = 'X';
            }
            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            //verificando a jogada 
            if (!jv.validarJogada(linha, coluna, sinal)) {
                System.out.println("**Posição utilizada tente novamnte**");
            }

            jv.imprimirTabuleiro();

            if (jv.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabens o jogador 1 ganhou!!!!!");
            } else if (jv.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabens o jogador 2 ganhou!!!!!");
            } else if (jv.jogada > 9) {
                ganhou = true;
                System.out.println("Ninguem ganhou...");
            }
        }

    }

    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean ValorValida = false;
        while (!ValorValida) {
            //linha
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                ValorValida = true;
            } else {
                System.out.println("Entrada invalida tente novamente!");
            }

        }
        valor--;
        return valor;
    }
}
