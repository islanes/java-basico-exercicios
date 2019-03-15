package aula31;

public class Carro {
	
	 // exemplo com metodo com retorno
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    //metodos com public e private
    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    public double obterAutonomia() {
        System.out.println("O metodo obter Autonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }

    
    private double divideKMPorConsumoCombustivel(double km) {
    	
    	return km/this.consumoCombustivel;
    }
    
    public double calcularCombustivel(double km) {
        
    	return this.divideKMPorConsumoCombustivel(km);
    }

}
