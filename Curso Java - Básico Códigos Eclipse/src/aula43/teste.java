
package aula43;

/**
 *
 * @author Islane dos S. Silva
 */
public class teste {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("Ciencia da computação");
        //inicalizando o array de notas com os valores
        double notas[] = {10, 9, 7,8};
        aluno.setNotas(notas);
        
        System.out.println(aluno);
        
        String s1 = "louL";
        String s2 = "loul";
        //demonstrado o uso de comparação de objeto
        System.out.println(""+s1.equalsIgnoreCase(s2));
        
            Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciencia da computação");
        //inicalizando o array de notas com os valores
        double notas2[] = {10, 9, 7,8};
        aluno2.setNotas(notas2);
        
        System.out.println(aluno2);
        
        System.out.println(aluno == aluno2);//aqui se verfica a referencia na memoria!!!
        System.out.println(aluno.equals(aluno2));//aqui se verfica os atributos!!!
        
    }
}
