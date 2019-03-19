
package aula46;

/**
 *
 * @author Islane dos S. Silva
 */
public interface BancoDados extends SqlDCL,SqlDML,SqlDDL {
//exemplo de uma interface que extende outras interfaces
    void abrirConexao();
    void fecharConexao();
}
