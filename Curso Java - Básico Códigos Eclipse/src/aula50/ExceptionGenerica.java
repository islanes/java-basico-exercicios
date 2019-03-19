package aula50;

/**
 *
 * @author Islane dos S. Silva
 */
public class ExceptionGenerica {

    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {//utilizado para que o programa continue sendo executado
                System.out.println(numeros[i] + " / " + denominadores[i] + " = " + (numeros[i] / denominadores[i]));

            } catch (Exception e) {
                System.out.println(""+e.getMessage());//quais os erros foram encontrados 
                e.printStackTrace();//muito utilizado em projetos esta msg exibe qual o erro e onde ambos são colocados em logs
            } 
        }
    }
}
