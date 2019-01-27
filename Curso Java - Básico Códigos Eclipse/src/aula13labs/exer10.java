package aula13labs;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Conversão de Temperatura\nDigite a temperatura em Celsius: ");
		double temperaturaC = scan.nextDouble();
		double temperaturaFarenheit = (temperaturaC  *1.8) + 32;
		//double temperaturaCelsius = (5* (temperaturaFarenheit - 32)/9);
		System.out.println("Graus em Farenheit: "+ temperaturaFarenheit + "ºf");
	}

}
