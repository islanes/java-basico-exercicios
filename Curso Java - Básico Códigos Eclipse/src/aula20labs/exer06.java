package aula20labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //jogo da velha com dois jogadores
        //este exercicio se refere a ao curso de java basico (loaine)
        char[][] jogoVelha = new char[3][3];

        System.out.println("O jogador 1 - O");
        System.out.println("O jogador 2 - X");

        boolean ganhou = false;
        int jogada = 0;
        char sinal;//valor que sera adicionado na matriz
        int linha = 0, coluna = 0;
        //utilizando o conceito de par e impar é decidido qual jogador deve jogar onde 1 impar e 2 par
        while (!ganhou) {

            if (jogada % 2 == 0) {
                System.out.println("Vez do jogador 1, escolha a linha e a coluna: ");
                sinal = 'O';
            } else {
                System.out.println("Vez do jogador 2, escolha a linha e a coluna: ");
                sinal = 'X';
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                //linha
                System.out.println("Entre com a linha 1, 2 ou 3:");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada invalida tente novamente!");
                }

            }//fim do while

            boolean colunaValida = false;
            while (!colunaValida) {
                //coluna
                System.out.println("Entre com a coluna 1, 2 ou 3");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada invalida tente novamente!");
                }
            }//fim do while

            //arrumando os indeices da matriz
            linha--;
            coluna--;
            //setando os valores alem de verificar 
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posição utilizada tente novamnte");

            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            //imprimindo o tabuleiro
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println("");
            }//fim da impressao

            //o ganhador aqui
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')
                    ||//linha1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')
                    ||//linha2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')
                    ||//linha3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')
                    ||//coluna1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')
                    ||//coluna2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')
                    ||//coluna3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') //diagonal
                    ) {
                ganhou = true;
                System.out.println("Parabens o jogador 1 ganhou!!!!!");

            } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')
                    ||//linha1
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')
                    ||//linha2
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')
                    ||//linha3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')
                    ||//coluna1
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')
                    ||//coluna2
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O')
                    ||//coluna3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') //diagonal
                    ) {
                ganhou = true;
                System.out.println("Parabens o jogador 2 ganhou!!!!!");

            }else if(jogada >9){
                ganhou = true;
                System.out.println("Ninguem ganhou...");
            }
        }

    }

}
