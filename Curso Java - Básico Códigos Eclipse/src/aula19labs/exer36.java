package aula19labs;


/**
 *
 * @author Islane dos S. Silva
 */
public class exer36 {

    public static void main(String[] args) {

        int[] a = new int[11];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(2, i);

        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("2^" + i + " = " + a[i]);
        }

        System.out.println(" ");
    }
}
