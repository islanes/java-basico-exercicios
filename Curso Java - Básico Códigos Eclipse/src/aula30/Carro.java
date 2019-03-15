package aula30;

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
    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando Construtor com 2 parametros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando Construtor com 3 parametros");
    }

    public Carro() {
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    double obterAutonomia() {
        System.out.println("O metodo obter Autonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }
}
