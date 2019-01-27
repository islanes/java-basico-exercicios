
package aula15labs;
import java.util.Scanner;
/**
 *
 * @author Islane dos S. Silva
 */
public class exer10 {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Digite em que turno você estuda:\nM - matutino\nV - vespertino\nN - noturno");
        String turno = scan.next();
        
        if(turno.equalsIgnoreCase("M")){
            System.out.println("Bom dia!");
        }else if(turno.equalsIgnoreCase("V")){
            System.out.println("Boa tarde.");
        }else if (turno.equalsIgnoreCase("N")){
            System.out.println("Boa noite.");
        }else{
            System.out.println("Digito incorreto.");
        }
    }
}
