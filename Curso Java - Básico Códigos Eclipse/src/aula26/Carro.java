
package aula26;
/**
 *
 * @author Islane dos S. Silva
 */

public class Carro {

    //exemplo com metodo com retorno
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
        
        void exibirAutonomia(){
            System.out.println("A autonomia do carro é "+capCombustivel * consumoCombustivel+" km");
        }
        
        double obterAutonomia(){
            System.out.println("O metodo obter Autonomia foi chamado.");
            return capCombustivel*consumoCombustivel;
        }
}
