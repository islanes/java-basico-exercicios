package aula41;

/**
 *
 * @author Islane dos S. Silva
 */
public class teste {

    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        //Aluno aluno = new Aluno();
        //pessoa.setEndereco("Rua 1, n 1");
        aluno.setEndereco("Rua 2, n 1");
        professor.setEndereco("Rua 1, n 9");

        //utilizando o metodo abstrato
        aluno.imprimirEtiquetaEndereco();
        
        /*System.out.println("" + pessoa.obterEtiquetaEndereco());
        System.out.println("" + aluno.obterEtiquetaEndereco());
        System.out.println("" + professor.obterEtiquetaEndereco());*/
    }
}
