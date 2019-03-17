
package aula34labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Contador {

    private static int cont;

    public Contador() {
        cont++;
    }
    
    
    //metodos para zerar o cont, incrementar e retrornar o valor de cont
    public static void  zerar(){
      cont = 0;
    }
    
    public static void incrementar(){
        cont++;
    }
    
    public static int retornar(){
        return cont;
    }
}

