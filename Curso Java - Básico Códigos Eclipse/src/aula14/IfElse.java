package aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			
			System.out.println("Voce � maior de idade");
			
		}else {
			System.out.println("Voce � menor de idade");
			
		}
		//item barato <= 10 
		//10 <= valor < 15 -- pedir desconto
		//15 <= valor < 17 -- pesquisar
		//>= 17 -- muito caro
		System.out.println("Digite o pre�o do item: ");
		double valor = scanner.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Item barato.");
		}else if(valor>10 && valor < 15) {
			System.out.println("Pe�a um desconto item.");
		}else if(valor>=15 && valor <17) {
			System.out.println("Pesquise por outro item mais barato.");
		}else {
			System.out.println("O item esta muito caro. ");
		}
		
		
		
	}

}
