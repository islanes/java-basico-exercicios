package aula42;

/**
 *
 * @author Islane dos S. Silva
 */
public class teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        /*Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();*/
        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        //Exemplo constante;        
        System.out.println(""+Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "new";//não pode modificar, imutavel

    }
}
