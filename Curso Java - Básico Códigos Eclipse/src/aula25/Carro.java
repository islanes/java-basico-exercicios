
package aula25;

/**
 *
 * @author Islane dos S. Silva
 */

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
        
        void eXibirAutonomia(){
            System.out.println("A autonomia do carro é "+capCombustivel * consumoCombustivel+" km");
        }
}
