
package aula35labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Calculadora {

    public static int fibo(int num){
        
        if(num<2){
            return 1;
        }
        
        return fibo(num-1) + fibo(num-2);
        
    }
    
    //realizando um somatorio ate um numero especifico

    public static int somatorio(int num){
        if(num == 1){
            return 1;
        }
        return num + somatorio(num-1);
        
    }

}

