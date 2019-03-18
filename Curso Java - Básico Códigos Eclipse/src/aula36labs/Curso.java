package aula36labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Curso {

    private String nomeCurso;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String obterInfo() {

        String info = "Nome do Curso " + nomeCurso;

        if (professor != null) {
            info += professor.obterInfo();
        }

        if (alunos != null) {
            //System.out.println("-- Alunos --");
            for (Aluno aluno : alunos) {
                if (alunos != null) {
                    info+="\n";
                    info += aluno.obterInfo();
                    info+="\n";
                }
            }
            //media da turma
            info += "\nMedia da Turma: " + obterMediaTurma();
        }
        return info;
    }

    public double obterMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (alunos != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
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
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the alunos
     */
    public Aluno[] getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

}
