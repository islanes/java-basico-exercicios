package aula27labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer03 {

    //teste classe aluno
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Digite a matricula do aluno: ");
        aluno.matricula = scan.next();

        System.out.println("Digite o nome do Curso: ");
        aluno.nomeCurso = scan.next();

        aluno.nomeDisciplinas = new String[3];
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {

            System.out.println("Digite o nome da disciplina "+(i+1));
            aluno.nomeDisciplinas[i] = scan.next();
        }

      
        aluno.notasDisciplinas = new double[3][4];
        
         for (int i = 0; i < aluno.notasDisciplinas.length; i++) {

            System.out.println("Digite o nota da disciplina "+aluno.nomeDisciplinas[i]);
           // aluno.notasDisciplinas[i] = scan.neXtDouble();
             for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                 System.out.println("Entre com a nota: "+(j+1));
                 aluno.notasDisciplinas[i][j] = scan.nextDouble();
             }
        }

         aluno.mostrarInfo();
         //verificando se foi aprovado nas diciplinas cursadas
         for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            
             if(aluno.verificarAprovado(i)){
                 System.out.println("Aluno foi aprovado na disciplina "+aluno.nomeDisciplinas[i]);
             }else{
                 System.out.println("Aluno não foi aprovado na disciplina "+aluno.nomeDisciplinas[i]);
             }
        }
    }
}
