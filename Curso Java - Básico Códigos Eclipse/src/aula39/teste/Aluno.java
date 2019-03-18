package aula39teste;

import aula39.Pessoa;

/**
 *
 * @author Islane dos S. Silva
 */
public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public void verificarAcesso() {
        this.nomeVisibilidade2 = "visivel";
        super.nomeVisibilidade2 = "b";
        
        this.nomeVisibilidade4 = "visivel";
        super.nomeVisibilidade = "b";
        
        this.setNomeVisibilidade("visivel");//exemplo de settar um valor de pessoa

    }

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);//acesso a superClasse -> Pessoa
        this.curso = curso;
    }

    public void metodoQualquer() {
        super.getCpf();//da classe pessoa

    }

    public double calcularMedia() {
        double media = 0;
        return media;
    }

    public boolean verificarAprovado() {
        return true;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

}
