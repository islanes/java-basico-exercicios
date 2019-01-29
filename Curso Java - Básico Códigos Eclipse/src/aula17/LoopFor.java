package aula17;

public class LoopFor {

	public static void main(String[] args) {

		System.out.println("Contando...");
		for (int i = 0; i <= 10; i++) {
			System.out.println("" + i);
		}
		//exemplo decremento

		System.out.println("Decrementando...");

		for (int i = 10; i > 0; i--) {
			System.out.println("" + i);
		}

		System.out.println("testando...");

		for (int i = 5; i >= 0; --i) {
			System.out.println("" + i);
		}

		System.out.println("testando novamente ...");

		for (int i = 0, j = 10; i <= j; i++, --j) {
			System.out.println("valor de i: " + i + " valor de j: " + j);
		}
		//testando outras possibilidades 
		int f = 0;
		for (; f < 10; f++) {
			System.out.println("valor de f " + f);
		}
	}

}
