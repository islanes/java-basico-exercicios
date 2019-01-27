package aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean  resultado1 = (valor1 == 1) && (valor2 ==2);
		System.out.println("O valor1 é 1 AND valor2 é 2 - resultado "+ resultado1);
	
		boolean  resultado2 = (valor1 == 1) || (valor2 ==2);
		System.out.println("O valor1 é 1 OR valor2 é 2 - resultado "+ resultado2);
		
		boolean v = true;
		boolean f = false;
		System.out.println(v && f);	
		System.out.println(v || f);	//unica condição para dar falso se for f+f
		System.out.println(v ^ f);	
		System.out.println(!v || f);	
		//System.out.println(!v == f); 	
	}

}
