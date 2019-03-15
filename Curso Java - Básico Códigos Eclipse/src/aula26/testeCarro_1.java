
package aula26;

import aula25.*;

/**
 *
 * @author Islane dos S. Silva
 */
public class testeCarro_1 {

   

	public static void main(String[] args) {

		Carro van = new Carro();

		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);

		van.exibirAutonomia();
                double autonomia = van.obterAutonomia();
                
                System.out.println("A autonomia do carro é "+autonomia);

	}
}