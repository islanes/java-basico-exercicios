package aula13labs;

import java.util.Scanner;

public class exer13 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		//calculo do salario
		System.out.println("Salario por Mês\nDigite quanto você ganha por hora"
				+ " e quantas horas voce trabalhou no mês: ");
		double porHora = scan.nextDouble();
		int diasTrabalhado = scan.nextInt();
		double salario = porHora * diasTrabalhado;
		System.out.println("Seu sal�rio Bruto � R$"+(salario));
		
		//quanto pagou INSS 8%
		double inss = (salario/100) * 8;
		
		//pagou sindicato 5%
		double sindicato = (salario/100) * 5;
		
		//imposto de renda 11%
		double impostoRenda = (salario/100) * 11;
		
		//salario liquido 
		double salarioLiquido = salario - inss;
		salarioLiquido = salarioLiquido - sindicato;
		salarioLiquido = salarioLiquido - impostoRenda;
		
						
		System.out.println("Valor pago para o INSS R$"+inss+"\nValor pago ao Sindicato R$" +sindicato+
				"\nO Salario Liquido é R$"+salarioLiquido);

	
	}

}
