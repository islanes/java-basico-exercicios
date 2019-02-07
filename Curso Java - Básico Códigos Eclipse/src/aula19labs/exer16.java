
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Realizando a soma dos valores iguais a 15, menores que 15 e a media dos valores maiores que 15
        int[] a = new int[10];
        int somaMenor = 0;
        int somaMaior = 0;
        int somaIgual = 0;
        
        int cont  = 0;
        double media = 0;
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o numero da posição " + (i + 1));
            a[i] = scan.nextInt();

        }
        // a soma de valores inferiores a 15
        for (int i = 0; i < a.length; i++) {
            if(a[i] <15){
                somaMenor += a[i];
            }else if(a[i] == 15){
                somaIgual += a[i];
            }else if(a[i] >15){
                cont += 1;//quantidade de valores maiores que 15
                somaMaior += a[i];
            }
        }
        
            media = somaMaior / cont;
        
        //imprimindo o vetor A
        for (int i = 0; i < a.length; i++) {
            System.out.print(" | "+ a[i]);
        }

        System.out.println("\nA soma dos valores menores a 15: " + somaMenor);
        System.out.println("A soma dos valores iguais a 15: " + somaIgual);
        System.out.println("A media dos valores maiores a 15: " +media);
    }
}

