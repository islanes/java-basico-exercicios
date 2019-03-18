
package aula39;



/**
 *
 * @author Islane dos S. Silva
 */
public class Professor extends Pessoa {

    private String nomeCurso;
    private double salario;
    
    public void verificarAcesso() {
       
        super.setNomeVisibilidade("Visivel");//setando o valor de pessoa
        //this.setNomeVisibilidade4("Visivel");//setando o valor de pessoa

    }
    

    public double salarioBruto(){
        
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
    
    
}
