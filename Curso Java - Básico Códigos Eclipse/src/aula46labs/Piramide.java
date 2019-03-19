package aula46labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Piramide extends Figura3D {

    private double altura;
    private double arestaBase;
    private double apotema;
    private Figura2D base;
    private int numPoliBase;

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the arestaBase
     */
    public double getArestaBase() {
        return arestaBase;
    }

    /**
     * @param arestaBase the arestaBase to set
     */
    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    /**
     * @return the apotema
     */
    public double getApotema() {
        return apotema;
    }

    /**
     * @param apotema the apotema to set
     */
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    /**
     * @return the base
     */
    public Figura2D getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        //area total
        if (base != null) {
            return (numPoliBase * ((arestaBase * apotema) / 2)) + base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {

        if (base != null) {
            return (base.calcularArea() * altura) / 3;
        }
        return 0;
    }

}
