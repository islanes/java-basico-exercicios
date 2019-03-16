package aula33labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    //construtores
    public Aluno() {
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    
    public void mostrarInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Curso: " + getNomeCurso());
        System.out.println("Disciplinas cursadas: ");

        for (int i = 0; i < getNomeDisciplinas().length; i++) {
            System.out.println(getNomeDisciplinas()[i]);
        }

        System.out.println("Notas adquiridas: ");
        for (int i = 0; i < getNotasDisciplinas().length; i++) {
            System.out.println("Disciplina: " + getNomeDisciplinas()[i]);
            for (int j = 0; j < getNotasDisciplinas()[i].length; j++) {
                System.out.println("nota " + getNotasDisciplinas()[i][j]);
            }
        }
    }

    public boolean verificarAprovado(int indiceDisciplina) {

        if (obterMedia(indiceDisciplina) >= 7) {
            return true;

        }
        return false;

    }

    private double obterMedia(int indiceDisciplina) {

        //verificando a media de uma disciplina
        double soma = 0;
        for (int i = 0; i < getNotasDisciplinas()[indiceDisciplina].length; i++) {
            soma += getNotasDisciplinas()[indiceDisciplina][i];
        }

        double media = soma / 4;
        return media;

    }
    
    //metodos para setar o nome das disciplinas
    public void SetNomeDisciplina(int pos, String nomeDisciplina){
        this.nomeDisciplinas[pos] = nomeDisciplina;      
                
    }
    
    //metodo para setar os valores das nostas 
     public void SetNotasDisciplina(int posI,int posJ, double notasDisciplina){
        this.notasDisciplinas[posI][posJ] = notasDisciplina;      
                
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
     * @return the nomeDisciplinas
     */
    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    /**
     * @param nomeDisciplinas the nomeDisciplinas to set
     */
    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    /**
     * @return the notasDisciplinas
     */
    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    /**
     * @param notasDisciplinas the notasDisciplinas to set
     */
    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
}
