
package aula52labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class AgendaCheiaException extends Exception{

    @Override
    public String getMessage() {
        return "****  Agenda já está cheia  ****";
    }
    
    

}
