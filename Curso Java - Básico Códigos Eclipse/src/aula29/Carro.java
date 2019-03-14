
package aula29;

/**
 *
 * @author Islane dos S. Silva
 */

public class Carro {

	// exemplo com metodo com retorno
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// construtor Carro, neste exemplo os valores são recebidos como parametros facilitando o uso da classe

        Carro(){};
        
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = capCombustivel_;
	}
	

	void eXibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia() {
		System.out.println("O metodo obter Autonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
}
