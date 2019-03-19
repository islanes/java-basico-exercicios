
package aula43labs.exer03;

/**
 *
 * @author Islane dos S. Silva
 */
public class Peixe extends Animal{

    private String caracteristicas;
    
    public Peixe(){
        super();
        //informações padrao
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "barbatanas e caldas";
    }
    

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {

        String s = super.toString();
        s+="\nCaracterisicas: "+caracteristicas;
       
        return s;

    }

    
}

