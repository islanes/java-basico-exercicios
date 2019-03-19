
package aula46;

/**
 *
 * @author Islane dos S. Silva
 */
public interface SqlDCL {

    void grant(String access);
    void revoke(String access);
}
