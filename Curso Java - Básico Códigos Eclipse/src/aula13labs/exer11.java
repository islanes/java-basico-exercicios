package aula13labs;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nDigite dois numeros inteiros: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("\nDigite um numero real: ");
		double n3 = scan.nextDouble();
		
		//o produto do dobro do primeiro com a metade do segundo
		System.out.println("O produto do dobro do primeiro com a metade do segundo: "+ (2*n1+(n2/2)));
		//a soma do triplo do primeiro com o terceiro
		System.out.println("A soma do triplo do primeiro com o terceiro: "+ ((3* n1) + n3));
		//o terceiro elevado ao cubo
		System.out.println("O terceiro elevado ao cubo: "+ Math.pow(n3, 3));
	}

}
