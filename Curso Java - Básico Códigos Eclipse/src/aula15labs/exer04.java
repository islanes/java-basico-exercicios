package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer04 {
    //verificando se é Vogal ou Consoante obs. não possui excesão para numeros!
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Descobrindo se uma letra é VOGAL OU CONSOANTE:\nDigite uma letra: ");
        String letra = scan.next();
        if (letra.length()> 1){
            System.out.println("Não é uma letra!");
        }else if (letra.equalsIgnoreCase("a")){
            System.out.println("Vogal.");  
        }else if(letra.equalsIgnoreCase("e")){
            System.out.println("Vogal.");  
        }else if(letra.equalsIgnoreCase("i")){
            System.out.println("Vogal.");  
        }else if(letra.equalsIgnoreCase("o")){
            System.out.println("Vogal.");  
        }else if(letra.equalsIgnoreCase("u")){
          System.out.println("Vogal.");  
        }else{
            System.out.println("Consoante.");
        }
       
        /*
        switch(letra){
            case 'a':
            case 'e':
            case 'o':
            case 'i':
            case 'u':
                System.out.println("Vogai.");
            break;
            default:
                System.out.println("Consoante.");
        }*/
    }
}
