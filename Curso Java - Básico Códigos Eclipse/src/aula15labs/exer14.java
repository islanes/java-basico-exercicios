package aula15labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer14 {

    public static void main(String[] args) {
        //lendo notas e calculando a media e dando conceito para a media e logo a aprovação ou não
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String conceito = "A";
        System.out.println("A media de um aluno.\nDigite a primeira nota do Aluno:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota do Aluno:");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;

        //verificando se as notas são corretas
      
        if (media >= 9 && media <= 10) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
        } else if (media <= 0 && media < 4) {
            conceito = "E";
        }/*else if (nota1 < 0 || nota1 > 10 || nota2 > 10 || nota2 < 0) {
        System.out.println("As notas devem ser entre 0 e 10!!");
        
        }*/
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {

            System.out.println("Notas: NOTA 1: " + nota1 + " NOTA 2: " + nota2);
            System.out.println("Média " + media);
            System.out.println("Conceito: " + conceito);
            System.out.println("Aprovado.");
        } else {

            System.out.println("Notas: NOTA 1: " + nota1 + " NOTA 2: " + nota2);
            System.out.println("Média " + media);
            System.out.println("Conceito: " + conceito);
            System.out.println("Reprovado.");
        }
    }
}

