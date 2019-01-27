package aula13labs;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {

		//soma de dois numeros
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite um numero: ");
		int n2 = scan.nextInt();
		
		System.out.println("Soma é: "+ (n1+n2));
	}

}
