package aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean verdadeiro1 = true;
		boolean falso = false;
		
		boolean  resultado1 =  falso & verdadeiro1;
		boolean resultado2 = falso && verdadeiro1;//curto circuito pois ele não veo outro resultado
		//mais utilizado do que o primeiro. 
						
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
	}

}
