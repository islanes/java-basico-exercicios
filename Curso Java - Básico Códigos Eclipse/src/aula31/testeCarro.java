package aula31;

public class testeCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.marca = "Fiat";
		carro.marca = "";
		carro.capCombustivel = 90;
		carro.consumoCombustivel = 9;
		
		
		//carro.calcularCombustivel(10);
		
		System.out.println(carro.calcularCombustivel(10));
	
		
	}

}
