
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer15 {

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //obtendo o percentual de valores impares e pares dos valores armazenados no vetor

        int[] a = new int[10];
        int par = 0;
        int impar = 0;
        double percPar = 0;
        double percImpar = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o numero da posição " + (i + 1));
            a[i] = scan.nextInt();

        }
        //contando os valores impares e realizando soma dos vaores 
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                impar += 1;
                //soma += a[i];

            }else {
                par += 1;
            }
        }

        percImpar = (impar * 100) / a.length;             
        percPar = (par * 100) / a.length;
        System.out.println("O percentual de numeros pares foi de " + percPar + "%");
        System.out.println("O percentual de numeros impares foi de " + percImpar + "%");
    }
    
    
}
