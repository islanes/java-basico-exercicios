package aula24labs;

import java.util.Date;

public class exer04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// exemplo da construção de um objeto do tipo livro
		LivroBiblioteca  livro = new LivroBiblioteca();

		livro.titulo = "Python Para Análise de Dados: Tratamento de Dados com Pandas, NumPy e IPython";
		livro.anoLancamento = 2018;
		livro.ISBN = "8575226479";
		livro.qtdPaginas = 616;
		livro.autor = new String[1];
		livro.autor[0] = "Wes McKinney";
		livro.dataEmprestimo = new Date();
		livro.emprestado = true;

		System.out.println("Livro: " + livro.titulo);
		System.out.println("Ano lançamento: " + livro.anoLancamento);
		System.out.println("Autor: " + livro.autor[0]);
		System.out.println("ISBN: " + livro.ISBN);
		System.out.println("Paginas " + livro.qtdPaginas + " pgs");
		System.out.println("Emprestado " + livro.emprestado);
		System.out.println("Data emprestimo " + livro.dataEmprestimo);
		

	}

}
