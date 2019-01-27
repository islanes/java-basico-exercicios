package aula13labs;

import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculo da Área de Um Qaudrado\nDigite o lado do Quadrado: ");
		double ladoQuadrado = scan.nextDouble();
		
		System.out.println("O dobro da área do Quadrado é: "+ (2*(Math.pow(ladoQuadrado, 2))));
	}

}
