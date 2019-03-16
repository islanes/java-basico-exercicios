package aula33labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class JogoVelha {

    private char[][] jogoVelha;
    //private boolean ganhou = false;
    private int jogada;

    //construtores
    public JogoVelha() {

        jogoVelha = new char[3][3];
        jogada = 1;   
    }

    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (getJogoVelha()[linha][coluna] == 'X' || getJogoVelha()[linha][coluna] == 'O') {
            //System.out.println("Posição utilizada tente novamnte");

            return false;
        } else {
            getJogoVelha()[linha][coluna] = sinal;
            setJogada(getJogada() + 1);
            return true;
        }

    }

    public void imprimirTabuleiro() {

        for (int i = 0; i < getJogoVelha().length; i++) {
            for (int j = 0; j < getJogoVelha()[i].length; j++) {
                System.out.print(getJogoVelha()[i][j] + " | ");
            }
            System.out.println("");
        }

    }

    public boolean verificarGanhador(char sinal) {

        if ((getJogoVelha()[0][0] == sinal && getJogoVelha()[0][1] == sinal && getJogoVelha()[0][2] == sinal)
                ||//linha1
                (getJogoVelha()[1][0] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[1][2] == sinal)
                ||//linha2
                (getJogoVelha()[2][0] == sinal && getJogoVelha()[2][1] == sinal && getJogoVelha()[2][2] == sinal)
                ||//linha3
                (getJogoVelha()[0][0] == sinal && getJogoVelha()[1][0] == sinal && getJogoVelha()[2][0] == sinal)
                ||//coluna1
                (getJogoVelha()[0][1] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[2][1] == sinal)
                ||//coluna2
                (getJogoVelha()[0][2] == sinal && getJogoVelha()[1][2] == sinal && getJogoVelha()[2][2] == sinal)
                ||//coluna3
                (getJogoVelha()[0][0] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[2][2] == sinal) //diagonal
                || (getJogoVelha()[0][2] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[2][2] == sinal) //diagonal inversa
                ) {
            return true;

        }
        return false;

    }

    public boolean vezJogador1() {

        if (getJogada() % 2 == 1) {
            return true;
        }
        return false;

    }

    /**
     * @return the jogoVelha
     */
    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    /**
     * @param jogoVelha the jogoVelha to set
     */
    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    /**
     * @return the jogada
     */
    public int getJogada() {
        return jogada;
    }

    /**
     * @param jogada the jogada to set
     */
    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

}
