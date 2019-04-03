package aula54;

public class testeEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString() + " - "+ dia.getValor());
		
		Data data = new Data(1, 4, 2019, DiaSemana.SEGUNDA);
	}

}
