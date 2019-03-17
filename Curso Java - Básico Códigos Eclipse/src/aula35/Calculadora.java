
package aula35;

/**
 *
 * @author Islane dos S. Silva
 */
public class Calculadora {

        public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mult(int n1, int n2) {
        return n1 * n2;
    }

    public static int div(int n1, int n2) {
        return n1 / n2;
    }
    
    public static double pot(int n1, int n2){
        return Math.pow(n1, n2);
    }
    
    public static int fatorialNaoRecursivo(int n){
        
        if (n == 0){
            return 1;
        }
        
        int total = 1;
        
        for (int i = n; i >1; i--) {
           total *=i; 
        }
        return total;
    }
    
    //metodo recursivo vantagem mais facil de ler, entender mas a performance não quer dizer que  é boa por exemplo
    //muito utilizado em estrutura de dados
    public static int fatorial(int num){
        if(num==0){
            return 1;
        }
        
        return num * fatorial(num-1);
    }
}
