package aula15labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer19 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Digite com o primeiro numero: ");
		int n1 = scan.nextInt();
		double resultado = 0;
		boolean valido = true;
		System.out.println("Digite com o segundo numero: ");
		int n2 = scan.nextInt();

		System.out.println("Digite a operacao: / * + -");
		String operacao = scan.next();

		if (operacao.equals("*")) {
			if (n2 == 0) {
				System.err.println("Não a divisão por 0)");
			} else {
				resultado = n1 * n2;
			}
		} else if (operacao.equals("/")) {
			resultado = n1 / n2;
		} else if (operacao.equals("+")) {
			resultado = n1 + n2;
		} else if (operacao.equals("-")) {
			resultado = n1 - n2;
		} else {
			System.out.println("Operação invalida ");
			valido = false;
		}
		// flag aqui e if aninhado!
		if (valido == true) {
			System.out.println("O resultado foi " + resultado);

			if (resultado % 2 == 0) {
				System.out.println("O resultado é  par.");
			} else {
				System.out.println("O resultado é impar.");
			}

			if (resultado < 0) {
				System.out.println("O resultado é negativo");
			} else {
				System.out.println("O resultado é positivo");
			}
		} else {
			System.out.println("Finalizando o programa");
		}
	}
}
