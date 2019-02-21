package aula20;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] [] notasAlunos = new double[2][4];
		
		notasAlunos [0][0]= 10;
		notasAlunos [0][1]= 4;
		notasAlunos [0][2]= 6.9;
		notasAlunos [0][3]= 8;
		

		notasAlunos [1][0]= 9.7;
		notasAlunos [1][1]= 4;
		notasAlunos [1][2]= 5;
		notasAlunos [1][3]= 10;

		double soma = 0;
		
		
		for (int i = 0; i < notasAlunos.length; i++) {
			//System.out.print(notasAlunos[i]+"  ");
			
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j]+ " - ");
			}
			System.out.println();
		}
		System.out.println("Caluclando a media: ");
		
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;//inicializando a soma para a proxima iteração
			for (int j = 0; j < notasAlunos[i].length; j++) {
			//	System.out.print(notasAlunos[i][j]+ " - ");
				soma += notasAlunos[i][j];
			}
			System.out.println("A media do aluno "+(i+1)+ " é "+ (soma/4));
		}
	

	}

}
