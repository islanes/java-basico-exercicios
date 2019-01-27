package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer03 {
    //verificando o sexo Feminino ou Masculino
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite F para Feminino ou M para Masculino:");
        String sexo = scan.next();
        //Dica: utilizando o IgnoreCase ao qual ignora se é MAIUSCULO ou minusculo
        if (sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo Masculino");
        }else if (sexo.equalsIgnoreCase("f")){
            System.out.println("Sexo Feminino");
        }else{
            System.out.println("Digito Incorreto!");
        }
    }
}
