package aula46labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Quadrado extends Figura2D {

    private int lado;

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        return lado * lado;
    }

}
