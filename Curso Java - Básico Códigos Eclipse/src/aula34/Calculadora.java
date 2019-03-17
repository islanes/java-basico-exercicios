package aula34;

/**
 *
 * @author Islane dos S. Silva
 */
public class Calculadora {

    public static int soma(int n1, int n2) {

        return n1 + n2;
    }

    public static int soma(int n1, int n2, int n3) {

        return n1 + n2 + n3;
    }

    public static double soma(double n1, double n2) {

        return n1 + n2;
    }

    public static int soma(int[] vetorInteiros) {

        int total = 0;
        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }

}
