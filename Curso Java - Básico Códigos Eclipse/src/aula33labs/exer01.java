package aula33labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer01 {

    public static void main(String[] args) {

        Lampada l = new Lampada();

        l.mostrarEstado();
        l.ligarLampada();

        l.mostrarEstado();

        l.desligarLampada();

        l.mudarEstado();
        
        l.mostrarEstado();
    }

}
