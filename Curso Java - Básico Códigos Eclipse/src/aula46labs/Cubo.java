
package aula46labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Cubo extends Figura3D{

    private int aresta;

    /**
     * @return the aresta
     */
    public int getAresta() {
        return aresta;
    }

    /**
     * @param aresta the aresta to set
     */
    public void setAresta(int aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return 6 * (aresta*aresta);
    }

    @Override
    public double calcularVolume() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return (Math.pow(aresta,3));
    }
}
