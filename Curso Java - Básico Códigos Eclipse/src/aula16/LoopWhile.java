package aula16;

public class LoopWhile {

	public static void main(String[] args) {
		// Estrutura loop while exemplos

		int i = 1;
		int max = 10;
		// contando
		System.out.println("Contando ate: " + max);
		// observa��o utilizando apenas while primeiro avalia a exepress�o:
		while (i <= max) {

			System.out.println(i);
			i++;
		} // continua aqui * fora do while
		System.out.println("valor de " + i);

		// observa��o ao utilizar do... while o codigo executa uma vez e logo �
		// verificado a sua condi��o
		do {

			i++;
			System.out.println(i);

		} while (i < 20);
		System.out.println("Fim do segundo while");

	}
}
