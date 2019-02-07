package aula18;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class BreakContinue_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //consiste como um goto, não sendo utilizado no mundo do desenvolvimento!!
        for (int i = 0; i <= 4; i++) {

            rotulo1:
            {
                rotulo2:
                {
                    rotulo3:
                    {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }System.out.println("rotulo3");
                    }System.out.println("rotulo2");
                }System.out.println("rotulo1");
            }System.out.println(i);
        }
    }
}
