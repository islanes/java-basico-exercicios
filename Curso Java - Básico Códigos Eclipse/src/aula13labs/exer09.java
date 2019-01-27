package aula13labs;

import java.util.Scanner;

public class exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Conversão de Temperatura\nDigite a temperatura em Farenheit: ");
		double temperaturaFarenheit = scan.nextDouble();
		double temperaturaCelsius = (5* (temperaturaFarenheit - 32)/9);
		System.out.println("Graus em Celsius: "+ temperaturaCelsius + "ºC");
	}
	
}
