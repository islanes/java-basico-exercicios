package aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// trabalhando com uma matriz tridimensional
		// criando uma matriz
		int[][][] matrizTrid = new int[3][3][3];

		// adicionando valores na matriz tridimensional
		for (int i = 0; i < matrizTrid.length; i++) {//primeiro vetor

			for (int j = 0; j < matrizTrid[i].length; j++) {//segundo vetor

				for (int k = 0; k < matrizTrid[i][j].length; k++) {//terceiro
					matrizTrid[i][j][k] = i + j + k;
				}
			}
		}

		// relizando a soma das seguintes maneiras
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;

		for (int i = 0; i < matrizTrid.length; i++) {

			for (int j = 0; j < matrizTrid[i].length; j++) {

				for (int k = 0; k < matrizTrid[i][j].length; k++) {
					soma += matrizTrid[i][j][k] = i + j + k;

					System.out.println("i = " + i + " j = " + j + " k = " + k + "");
					if (matrizTrid[i][j][k] % 2 == 0) {
						somaPares += matrizTrid[i][j][k];
					} else {
						somaImpares += matrizTrid[i][j][k];
					}
				}
			}
		}
		System.out.println("A soma dos valores é " + soma);
		System.out.println("A soma dos valores Pares é " + somaPares);
		System.out.println("A soma dos valores Impares é  " + somaImpares);
	}

}
