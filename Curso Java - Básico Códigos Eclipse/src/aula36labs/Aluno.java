package aula36labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public String obterInfo() {

        String info = "Nome " + nome + " - Matricula " + matricula + " - Notas:";

        double soma = 0;
        //verificando as notas
        for (double nota : notas) {
            //System.out.println("Nota ");
            info += nota + " ";
            soma += nota;
        }
        double media = soma / 4;
        info += "\nMedia: " + media + " - ";

        if (media >= 7) {
            info += "Aprovado";
        } else {
            info += "Reprovado";
        }

        return info;
    }

    public double obterMedia() {

        double soma = 0;
        //verificando as notas
        for (double nota : notas) {
                     
            soma += nota;
        }

        return soma / 4;
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
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
