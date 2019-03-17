
package aula34labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer02 {
    
    public static void main(String[] args) {
        System.out.println(Calculadora.pot(1, 2));
        
        imprimir(Calculadora.div(1, 2));
        
        imprimir(Calculadora.mult(1, 2));
        
        imprimir(Calculadora.somar(1, 2));
        
    }
    
    static void imprimir (int num){
        System.out.println(""+num);
    }

}
