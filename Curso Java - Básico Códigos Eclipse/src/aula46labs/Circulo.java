
package aula46labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Circulo extends Figura2D{

    private double raio;

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       return (Math.PI * raio * raio);
    }
}
