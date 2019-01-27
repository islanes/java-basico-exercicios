package aula13labs;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as suas 4 notas: ");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		double n4 = scan.nextDouble();
		double media = (n1+n2+n3+n4)/4;
		System.out.println("Sua média é: "+ media);
		
	}

}
