package aula36labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome do Curso: ");
        String curso = scan.nextLine();
        System.out.println("Entre com o horario do Curso: ");
        String horario = scan.nextLine();
        
        Curso c = new Curso();
        c.setNomeCurso(curso);
        c.setHorario(curso);
        
        System.out.println("Entre com o nome do Professor");
        String professor = scan.nextLine();
        System.out.println("Entre com o departamento do Professor");
        String dep = scan.nextLine();
        System.out.println("Entre com o email do Professor");
        String email = scan.nextLine();
        
        Professor p = new Professor();
        p.setNome(professor);
        p.setDepartamento(dep);
        p.setEmail(email);

        //adicionando o professor no curso
        c.setProfessor(p);
        
        System.out.println("--- Alunos ---");
        Aluno[] alunos = new Aluno[5];
        
        for (int i = 0; i < 5; i++) {
            scan.nextLine();
            System.out.println("Digite o nome do aluno: " + (i + 1));
            String nomeAluno = scan.nextLine();
            System.out.println("Entre com a matricula: ");
            String matricula = scan.nextLine();

            //obtendo as notas dos alunos
            double[] notas = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                notas[j] = scan.nextDouble();
                
            }
            //setando os valores 
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }
        c.setAlunos(alunos);
        System.out.println(c.obterInfo());
    }
    
}
