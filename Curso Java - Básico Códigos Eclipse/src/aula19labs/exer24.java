package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vet = new int[10];
        boolean palindromo = true;
        
        for (int i = 0; i < vet.length; i++) {

        System.out.println("Digite um numero da posição "+(i+1));
        vet[i] = scan.nextInt();
            
        }

        for (int i = 0; i < vet.length; i++) {

            if(vet[i] == vet[vet.length - 1 - i]){
                palindromo = false;
                break;
            }
        }
        if(palindromo == true){
            System.out.println("Palindromo");
        }else{
            System.out.println("Não é palindromo.");
        }
          
                
    }
    

}
