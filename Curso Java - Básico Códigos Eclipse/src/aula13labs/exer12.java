package aula13labs;

import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("IMC\nDigite sua altura: ");

		double altura = scan.nextDouble();

		System.out.println("Seu peso ideal é: "+ ((72.7 * altura ) - 58));

	}

}
