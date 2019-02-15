package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[20];

        System.out.println("Adicionando valores no vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o valor da posição " + (i + 1));
            a[i] = scan.nextInt();
        }

        System.out.println("Adicionando valores no vetor B:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o valor da posição " + (i + 1));
            b[i] = scan.nextInt();
        }

        //adiconando valores no vetor C
        for(int i = 0; i < a.length; i++) {
            c[i] = a[i];
            
        }
        for(int i = 0; i < a.length; i++) {
            c[a.length+i] = b[i];
            
        }
        
        System.out.println("Vetor A");
        for (int i = 0; i < a.length; i++) {
            
            System.out.print("  " + a[i]);
        }
        
        System.out.println("\nVetor B");
        for (int i = 0; i < b.length; i++) {
            
            System.out.print("  " + b[i]);
        }
        
        System.out.println("\nVetor C");
        for (int i = 0; i < c.length; i++) {
            
            System.out.print("  " + c[i]);
        }
        
    }
}
