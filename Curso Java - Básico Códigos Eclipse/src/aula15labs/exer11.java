
package aula15labs;
import java.util.Scanner;
/**
 *
 * @author Islane dos S. Silva
 */
public class exer11 {

     public static void main(String[] args) {
        double percentual = 0;
        double valorAumento;
        double novoSalario;
         
        Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Digite o salário do colaborador:");
        double salario = scan.nextDouble();
        //salario antes
        //percentual de aumento
        //o valor do aumento
        //o novo salario
        
        if(salario<= 280){
           percentual = 20;
           
        }else if(salario > 280 &&  salario <700){
           percentual = 15;
           
        }else if(salario>= 700 && salario <1500){
           percentual = 10;
           
        }else if(salario >= 1500){
          percentual = 5;
        }
        //resultado
        valorAumento = (salario/100)* percentual;
           novoSalario = valorAumento+salario;
           System.out.println("Salario anterior R$"+salario+"\nPercentual de aumento "+percentual+"%\nValor do aumento R$"+valorAumento+"\nSalario novo R$"+novoSalario);
     }
    
}
