package aula19labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer33 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        boolean primo = true;
        String msg = "";

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o elemento da posicao " + (i + 1));
            a[i] = scan.nextInt();
        }

        //
        for (int i = 0; i < a.length; i++) {
            primo = true;

            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                msg = "primo";
            } else {
                msg = "não é primo";
            }
            System.out.println("O numero " + a[i] + " " + msg);
        }
    }

}
