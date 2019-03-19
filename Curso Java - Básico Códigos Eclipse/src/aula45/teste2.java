
package aula45;

/**
 *
 * @author Islane dos S. Silva
 */
public class teste2 {
    public static void main(String[] args) {
        
        Object obj1 = obterString();
        String s1 = (String) obj1;
        
        Object obj2 = "MInha sTRing";
        String s2 = (String) obj2;
        
        //aqui ele não faz referencia a uma string 
        Object obj3 = new Object();
        //String s3 = (String) obj3;
        
        //casting de um tipo inteiro para um objeto
        Object obj4 = obterInteiro();
        String s4 = (String) obj4;
    }

    public static String obterString(){
        return "minha String";
    }
    
    public static int obterInteiro(){
        return 4;
    }
}
