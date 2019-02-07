
package aula18;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class BreakContinue {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        int num = scan.nextInt();
                
        System.out.println("Entre com um limite ");
        int max = scan.nextInt();
        
        for (int i = num; i <= max; i++) {
            System.out.println(i);
            if (i%7 ==0){
                System.out.println("Divisivel por 7:");
                System.out.println(i);
                break;//demosntrando o fim da cadeia do for no limite especificado 
                //saindo do for, mais utilizado...
            }
        }
    }
}
