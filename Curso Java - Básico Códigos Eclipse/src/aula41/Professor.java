package aula41;


/**
 *
 * @author Islane dos S. Silva
 */
public class Professor extends Pessoa {

    private String nomeCurso;
    private double salario;

    public double salarioBruto() {

        return 0;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String obterEtiquetaEndereco() {
        //return endereco;
        //sobreescrevendo o metodo
        String s = "Endereço do Professor: ";
        s += this.getEndereco();
        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Imprimindo o endereço do professor:");
        System.out.println(""+this.obterEtiquetaEndereco());
    }

}
