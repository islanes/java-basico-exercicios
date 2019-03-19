package aula52;

/**
 *
 * @author Islane dos S. Silva
 */
public class UsandoMinhaException {

    public static void main(String[] args) throws Exception {

        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    //lançado excption aqui

                    throw new DivisaoNaoExata(numeros[i], denominadores[i]);
                    //Exception("Número ímpar, divisão não exata.");
                }
                System.out.println(numeros[i] + " / " + denominadores[i] + " = " + (numeros[i] / denominadores[i]));

            } catch (ArithmeticException exception) {
                System.out.println("Erro ao dividir por ZERO");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Posição do array invalido");
            } catch (Exception e) {
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            }
        }
    }
}
