package aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int qtdFilhos = 0;
		System.out.println("Digite o total de pessoas que serão entrevistadas:");
		int numEntrevistados = scan.nextInt();

		String[][] nomeFilhos = new String[numEntrevistados][];

		for (int i = 0; i < nomeFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos: ");
			qtdFilhos = scan.nextInt();

			nomeFilhos[i] = new String[qtdFilhos];

			for (int j = 0; j < nomeFilhos[i].length; j++) {

				System.out.println("Digite o nome do " + (j + 1) + " filho(a):");
				nomeFilhos[i][j] = scan.next();
			}

		}

		//imprimindo os nomes dos filhos
		for (int i = 0; i < nomeFilhos.length; i++) {
			System.out.println("Pessoa " + (i + 1) + " tem " + nomeFilhos[i].length + " filhos.");
			for (int j = 0; j < nomeFilhos[i].length; j++) {
				System.out.println(" " + nomeFilhos[i][j]);
			}

		}

	}

}
