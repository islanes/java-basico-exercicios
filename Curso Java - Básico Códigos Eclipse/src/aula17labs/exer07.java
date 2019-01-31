package aula17labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //lendo cinco numeros e mostrando o maior de todos 
        int numero;
        //inicializando com o menor valor.
        int maior = Integer.MIN_VALUE;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            
            if(numero>maior){
                maior = numero;
            }
            System.out.println("O maior numero foi: "+maior);
        }
    }
}
