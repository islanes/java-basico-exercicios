package aula41;




/**
 *
 * @author Islane dos S. Silva
 */
public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

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

    public String obterEtiquetaEndereco(){
        //return endereco;
        //sobreescrevendo o metodo
        String s = "Endereço aluno: ";
        s+= this.getEndereco();
        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(""+this.obterEtiquetaEndereco());
    }
}
