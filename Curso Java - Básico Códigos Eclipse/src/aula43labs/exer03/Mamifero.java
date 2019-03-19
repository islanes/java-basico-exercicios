package aula43labs.exer03;

/**
 *
 * @author Islane dos S. Silva
 */
public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super();
        this.setCor("Castanho");
        alimento = "Mel";
        this.setAmbiente("Terra");
    }

    /**
     * @return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + alimento;
        
        return s;
    }

}
