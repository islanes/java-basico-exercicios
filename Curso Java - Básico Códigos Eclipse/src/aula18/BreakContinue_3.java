package aula18;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class BreakContinue_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite ");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {
            
            if (i % 7 == 0) {
               continue;//neste caso os valores não serão mostrados...
            }
            System.out.println(i);
        }

    }
}
