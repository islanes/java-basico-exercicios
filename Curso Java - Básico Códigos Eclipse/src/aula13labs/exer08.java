package aula13labs;

import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		//exercicio de calculo de salario
		Scanner scan = new Scanner(System.in);
		System.out.println("Salario por Mês\nDigite quanto você ganha por hora"
				+ "e quantas horas voce trabalhou no mês: ");
		double porHora = scan.nextDouble();
		int diasTrabalhado = scan.nextInt();
		System.out.println("Seu salário total é R$"+(porHora*diasTrabalhado));
	}

}
