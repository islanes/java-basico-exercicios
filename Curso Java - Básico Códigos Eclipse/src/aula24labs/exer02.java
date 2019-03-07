package aula24labs;

public class exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//exemplo da construção de um objeto do tipo livro
		Livro livro  = new Livro();
		
		livro.titulo = "Pense em Python: Pense Como um Cientista da Computação";
		livro.anoLancamento = 2016;
		livro.ISBN = "8575225081";
		livro.qtdPaginas = 312;
		livro.autor = new String[1];
		livro.autor[0] = "Allen Downey";
		
		System.out.println("Livro: "+livro.titulo);
		System.out.println("Ano lançamento: "+livro.anoLancamento);
		System.out.println("Autor: "+livro.autor[0]);
		System.out.println("ISBN: "+livro.ISBN);
		System.out.println("Paginas "+livro.qtdPaginas + " pgs");
		
	}

}
