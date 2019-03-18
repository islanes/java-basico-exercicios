package aula39;



/**
 *
 * @author Islane dos S. Silva
 */
public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    
    //String nomeVisibilidade;//default - visivel as classes do pacote
    protected String nomeVisibilidade;
    public String nomeVisibilidade2;//visivel todos
    private String nomeVisibilidade3;//visivel apenas na classe acesso apenas com get e set
    protected String nomeVisibilidade4;//visivel as subclasses de pessoa não importa em qual pacote elas estao
    

    public void setNomeVisibilidade(String nomeVisibilidade) {
        this.nomeVisibilidade = nomeVisibilidade;
    }

    
    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
