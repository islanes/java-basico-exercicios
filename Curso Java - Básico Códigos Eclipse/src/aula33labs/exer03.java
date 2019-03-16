
package aula33labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer03 {

    public static void main(String[] args) {
        //classe aluno
        Aluno aluno = new Aluno();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scan.next());

        System.out.println("Digite a matricula do aluno: ");
        aluno.setMatricula(scan.next());

        System.out.println("Digite o nome do Curso: ");
        aluno.setNomeCurso(scan.next());

        //aluno.nomeDisciplinas = new String[3];
        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {

            System.out.println("Digite o nome da disciplina "+(i+1));
            aluno.SetNomeDisciplina(i, scan.next());
        }

      
        //aluno.notasDisciplinas = new double[3][4];
        
         for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {

            System.out.println("Digite o nota da disciplina "+aluno.getNomeDisciplinas()[i]);
           // aluno.notasDisciplinas[i] = scan.neXtDouble();
             for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                 System.out.println("Entre com a nota: "+(j+1));
                 aluno.SetNotasDisciplina(i, j, scan.nextDouble());
             }
        }

         aluno.mostrarInfo();
         //verificando se foi aprovado nas diciplinas cursadas
         for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            
             if(aluno.verificarAprovado(i)){
                 System.out.println("Aluno foi aprovado na disciplina "+aluno.getNomeDisciplinas()[i]);
             }else{
                 System.out.println("Aluno não foi aprovado na disciplina "+aluno.getNomeDisciplinas()[i]);
             }
        }
    }
               
        
}
