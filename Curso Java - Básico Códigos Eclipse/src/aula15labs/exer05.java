package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer05 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A media de um aluno.\nDigite a primeira nota do Aluno:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota do Aluno:");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2)/2;
            
            if(media == 10){
                 System.out.println("Aprovado com distinção.");
            }else if (media >= 7){
                 System.out.println("Aprovado.");
            }else {
                 System.out.println("Reprovado.");
    
            }}
}
