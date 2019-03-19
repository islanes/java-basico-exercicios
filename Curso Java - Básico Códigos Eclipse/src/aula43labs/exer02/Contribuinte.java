
package aula43labs.exer02;

/**
 *
 * @author Islane dos S. Silva
 */
public abstract class Contribuinte {

    private String nome;
    private double rendaBruta;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rendaBruta
     */
    public double getRendaBruta() {
        return rendaBruta;
    }

    /**
     * @param rendaBruta the rendaBruta to set
     */
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    
    public abstract double calcularImposto();

    @Override
    public String toString() {
        String s = "\nNome: "+nome;
        s +=" - Renda Bruta: "+rendaBruta;
        return s;
                
    }
    
    
    
}
