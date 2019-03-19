
package aula44;

/**
 *
 * @author Islane dos S. Silva
 */
public abstract class Animal {
    
    private String animal;
    
    public abstract void emitirSom();

    /**
     * @return the animal
     */
    public String getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    

}
