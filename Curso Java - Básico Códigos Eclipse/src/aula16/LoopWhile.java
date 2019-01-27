package aula16;

public class LoopWhile {

	public static void main(String[] args) {
		// Estrutura loop while exemplos

		int i = 1;
		int max = 10;
		// contando
		System.out.println("Contando ate: " + max);
		// observação utilizando apenas while primeiro avalia a exepressão:
		while (i <= max) {

			System.out.println(i);
			i++;
		} // continua aqui * fora do while
		System.out.println("valor de " + i);

		// observação ao utilizar do... while o codigo executa uma vez e logo é
		// verificado a sua condição
		do {

			i++;
			System.out.println(i);

		} while (i < 20);
		System.out.println("Fim do segundo while");

	}
}
