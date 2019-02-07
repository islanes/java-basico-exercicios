
package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultados = new double[notas1.length];
        
        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Entre com a primeira nota do aluno "+(i+1));
            notas1 [i] = scan.nextDouble();
            System.out.println("Entre com a segunda nota do aluno ");
            notas2 [i] = scan.nextDouble();
            
            resultados [i] = (notas1[i] + notas2[i]) /2;
            
        }
        System.out.println("\nNotas 1:");
        for (int i = 0; i < notas1.length; i++) {
            System.out.print(" " +notas1[i]);
            
        }
        System.out.println("\nNotas 2:");
        for (int i = 0; i < notas2.length; i++) {
            System.out.print(" " +notas1[i]);
            
        }
        System.out.println("\nResultados:");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("O aluno " + (i + 1) );
            if(resultados[i] >= 7) {
                System.out.println( resultados[i] + " - Aluno Aprovado");
            }else {
                System.out.println( resultados[i] + " - Aluno Reprovado");
            }
            
        }
        
        
        
    }

}
