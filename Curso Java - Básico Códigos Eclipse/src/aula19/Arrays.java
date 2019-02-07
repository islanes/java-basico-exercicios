package aula19;

/**
 *
 * @author Islane dos S. Silva
 */
public class Arrays {

    public static void main(String[] args) {

        //trabahando com vetores/arrays
        double[] temperaturas = new double[365];
        //esta é a boa pratica de leitura, a declaraão do tipo e logo o array (double[])
        //inicializando o array:
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("Valor da Temperatura no primeiro dias: " + temperaturas[0]);
        System.out.println("Tamanho do array: " + temperaturas.length);
        System.out.println("Endereço de memoria do array Temperaturas: " + temperaturas);

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] != 0) {
                System.out.println("A temperatura do dia " + (i + 1) + " é " + temperaturas[i]);
            }else{
                //System.out.println((i+1) +"  -  " +temperaturas[i]);
            }

        }

    }
}
