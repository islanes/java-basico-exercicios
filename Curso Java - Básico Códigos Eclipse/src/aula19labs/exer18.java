
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer18 {

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //idades de um grupo de pessoas 

        int[] idades = new int[10];
       
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade da posição " + (i + 1));
            idades[i] = scan.nextInt();

        }
        
        double IdadeMaior = idades[0];
        double IdadeMenor = idades[0];
        int indexMaior = 0;
        int indexMenor = 0;
        
        for (int i = 1; i < idades.length; i++) {
            if (idades[i] >= IdadeMaior) {
                IdadeMaior = idades[i];
                indexMaior = i;
                
            }else if(idades[i] <= IdadeMenor){
                IdadeMenor = idades[i];
                indexMenor = i;
            }
        }

        //imprimindo o vetor A
        for (int i = 0; i < idades.length; i++) {
            System.out.print(" | "+ idades[i]);
        }
       
        System.out.println("\nA idade menor é de: " + IdadeMenor + " na posição "+indexMenor +"\nA idade maior é de "+IdadeMaior+ " na posição "+indexMaior);
        
    }
}
