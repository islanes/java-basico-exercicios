
package aula17labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer31 {
       public static void main(String[] args) {
                      
        Scanner scan = new Scanner(System.in);
        //calculando o percentual de salarios ao decorrer dos anos
        double salario = 1000;//ano 95
        double percentual = 1.5;
        salario += (salario /100) * percentual;//ano 96
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        
        
           for (int i = 1997; i < 2015; i++) {
               
               percentual *=2;
               salario += (salario /100) * percentual;
               System.out.println(i + " -  "+ format.format(salario) + " - "+percentual+ "%");
           }
  
       }
       
}
