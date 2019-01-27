package aula13labs;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o RAIO do ciruclo: ");
		double raio = scan.nextDouble();
		//area do circulo
		double areaCirculo;
		areaCirculo = Math.PI * Math.pow(raio, 2);
		System.out.println("A area do circulo é: "+ areaCirculo);

	}

}
