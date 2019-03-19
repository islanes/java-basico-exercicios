package aula45;

/**
 *
 * @author Islane dos S. Silva
 */
public class teste {

    public static void main(String[] args) {
        /*
        //tudo automatico
        //fazendo um upcasting
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno;//nivel maior
        
        Pessoa aluno2 = (Pessoa) new Aluno();
        
        //downcasting
        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;//casting manual
        */
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor p = new Professor();
        
        if(pessoa instanceof Pessoa){
            System.out.println("É do tipo Pessoa");
        }
        if(aluno instanceof Aluno){
            System.out.println("É do tipo Aluno");
        }
        if(p instanceof Professor){
            System.out.println("É do tipo Professor");
        }
        
    }
}
