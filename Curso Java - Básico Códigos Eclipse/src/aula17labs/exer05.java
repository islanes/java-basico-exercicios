package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //quantos anos para a populacao A ultrapassar a pop. B;
        //obs a população A deve ser menor do que a B
        
        double popA = 0;
        double popB = 0;
        double taxaA = 0;
        double taxaB = 0;
        int cont = 0;
        boolean valido = false;

        do {
            System.out.println("Digite a populacao A: ");
            popA = scan.nextDouble();
            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("A populacao deve ser maior que 0!!!!");
            }

        } while (!valido);

        
        
        valido = false;
        do {
            System.out.println("Digite a populacao B: ");
            popB = scan.nextDouble();
            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("A populacao deve ser maior que 0!!!!");
            }

        } while (!valido);
        
        
        valido = false;
        do {
            System.out.println("Digite a taxa de crescimento da populcao A: ");
            taxaA = scan.nextDouble();
            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("A populacao deve ser maior que 0!!!!");
            }

        } while (!valido);
        
        
        valido = false;
        do {
            System.out.println("Digite a taxa de crescimento da populcao B: ");
            taxaB = scan.nextDouble();
            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("A populacao deve ser maior que 0!!!!");
            }

        } while (!valido);
        
        //calculando a taxa da populacao    

      
        
        while (popA < popB) {

            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont++;

        }
        System.out.println("Populacao A " + popA + "\nPopulacao B " + popB);
        System.out.println("Total de anos é " + cont);
    }
}
