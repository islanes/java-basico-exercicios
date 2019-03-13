package aula27labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer01 {

    public static void main(String[] args) {
        //testando a classe lampada

        Lampada lamp = new Lampada();

        lamp.ligarLampada();
        lamp.mostrarEstado();

        lamp.desligarLampada();
        lamp.mostrarEstado();

    }

}
