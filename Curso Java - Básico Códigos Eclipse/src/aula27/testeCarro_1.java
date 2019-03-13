
package aula27;

import aula26.*;
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

		van.eXibirAutonomia();
                double autonomia = van.obterAutonomia();
                
                System.out.println("A autonomia do carro é "+autonomia);
                //informando km para o metodo
                double qtdCombustivel = van.calcularCombustivel(10);
                System.out.println("Para 10 km precisamos de "+qtdCombustivel);

	}
}