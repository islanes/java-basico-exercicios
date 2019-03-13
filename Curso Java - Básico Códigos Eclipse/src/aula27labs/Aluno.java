package aula27labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas;
    double[][] notasDisciplinas;

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Disciplinas cursadas: ");

        for (int i = 0; i < nomeDisciplinas.length; i++) {
            System.out.println(nomeDisciplinas[i]);
        }

        System.out.println("Notas adquiridas: ");
        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Disciplina: " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println("nota " + notasDisciplinas[i][j]);
            }
        }
    }

    boolean verificarAprovado(int indiceDisciplina) {

        if (obterMedia(indiceDisciplina) >= 7) {
            return true;

        }
        return false;

    }

    double obterMedia(int indiceDisciplina) {

        //verificando a media de uma disciplina
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[indiceDisciplina].length; i++) {
            soma += notasDisciplinas[indiceDisciplina][i];
        }

        double media = soma / 4;
        return media;
        

    }

}
