package aula13labs;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		//calculo do salario
		System.out.println("Entre com o tamanho do arquivo: ");
		double tArquivo = scan.nextDouble();
		System.out.println("Entre com a velocidade do Link");
		double velLink = scan.nextDouble();
		
		double tempo = tArquivo / velLink;
		System.out.println("Tempo de download "+ tempo);
	}

}
