package aula17labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer04 {

    public static void main(String[] args) {
            //quantos anos para a populacao A ultrapassar a pop. B;
        int popA = 80000;
        int popB = 200000;

        int cont = 0;
        
        while (popA < popB) {
           
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont ++;
            
        }
        System.out.println("Populacao A "+popA+"\nPopulacao B "+popB);
        System.out.println("Total de anos é "+cont);
        

    }

}



