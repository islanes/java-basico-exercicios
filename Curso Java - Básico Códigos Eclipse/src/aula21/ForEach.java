package aula21;

import java.util.Random;

/**
 *
 * @author Islane dos S. Silva
 */
public class ForEach {

    public static void main(String[] args) {
       
        int[] notas = new int[10];
        
        Random rand = new Random();
        
        for (int i = 0; i < notas.length; i++) {
            
            notas[i] = rand.nextInt(10);
            System.out.println(""+notas[i]);
            
        }
        
        System.out.println("Usando o For Each:");
        
        
        for (int nota: notas){
           nota = rand.nextInt(20);
            System.out.println(""+nota);
        }

    }

}
