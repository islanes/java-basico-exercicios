
package aula46;

/**
 *
 * @author Islane dos S. Silva
 */
public interface SqlDDL {
    
    void create(String query);
    void alter(String query);
    void drop(String query);
    
    

}
