package aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = 1+2;
		System.out.println("Resultado � : "+resultado);
		
		resultado = resultado -1;
		System.out.println("Resultado � : "+resultado);
		
		resultado = resultado * 2;
		System.out.println("Resultado � : "+resultado);
		
		resultado = resultado / 2;
		System.out.println("Resultado � : "+resultado);
		
		resultado = resultado + 8;
		System.out.println("Resultado � : "+resultado);
		
		resultado = resultado % 7;
		System.out.println("Resultado � : "+resultado);
		
		String primeiroNome = "Esta � ";
		String segundoNome = "uma string concatenada";
		String terceiroNome = primeiroNome+ segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado +1;
		System.out.println("Resultado � : "+resultado);
		resultado ++;
		System.out.println("Resultado � : "+resultado);
//valor 5 incrementa depois
		System.out.println("Resultado � : "+resultado++);
		//valor 7 incrementa antes
		System.out.println("Resultado � : "+ ++resultado);

		resultado--;
		System.out.println("Resultado � : "+resultado--);

		--resultado;
		System.out.println("Resultado � : "+resultado);



	}

}
