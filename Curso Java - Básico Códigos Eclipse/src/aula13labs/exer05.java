package aula13labs;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Conversão de Metros para Centimetros\nMetros: ");
		double metro = scan.nextDouble();
		System.out.println("Centimetros: "+(metro*100));

	}

}
