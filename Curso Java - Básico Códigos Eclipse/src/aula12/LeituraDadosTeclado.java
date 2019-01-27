package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome Completo: ");
		
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Seu nome completo é "+nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		
		System.out.println("Seu primeiro nome é "+primeiroNome);
		*/
		
		/*System.out.println("Digite sua idade ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é "+idade+ " anos");
		
		System.out.println("Digite sua altura ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é "+altura+ "");
		*/
		
		System.out.println("Digite seu primeiro nome, quantidade de filhos, altura, e se tem animal de estimação ");
		String nome = scan.next();
		int filho = scan.nextInt();
		double altura = scan.nextDouble();
		boolean animal = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes dados:");
		System.out.println("Filhos: "+filho);
		System.out.println("Primeiro nome: "+nome);
		System.out.println("ALtura: "+altura);
		System.out.println("Animal de estimação: "+animal);
		//System.out.println("Quantidade de filhos: "+);

	}

}
