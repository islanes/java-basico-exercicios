
package aula46;

/**
 *
 * @author Islane dos S. Silva
 */
public interface SqlDML {

    void select(String query);
    void insert(String query);
    void delete(String query);
    void update(String query);
}
