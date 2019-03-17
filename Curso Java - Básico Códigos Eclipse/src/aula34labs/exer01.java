package aula34labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer01 {

    static void imprimir() {
        System.out.println("" + Contador.retornar());
    }

    public static void main(String[] args) {

        //utilizando o static 
        imprimir();
        Contador.incrementar();
        imprimir();
        Contador.incrementar();
        imprimir();
        Contador.zerar();
        imprimir();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();

        imprimir();
    }

}
