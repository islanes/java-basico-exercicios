
package aula47;

/**
 *
 * @author Islane dos S. Silva
 */
public class Excecao {

    public static void main(String[] args) {
        
        try{
        //excecao
        int [] vetor = new int[5];
        System.out.println("Antes da excesao");
        
         vetor[5] = 1;//erro aqui como exemplo de uma excecao
         //contornando uma excecao
        
        System.out.println("Este texto não sera impresso");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Excecao ao acessar um indece do vetor que não existe");
        }
        System.out.println("Texto impressso depois da excecao");
    }
}
