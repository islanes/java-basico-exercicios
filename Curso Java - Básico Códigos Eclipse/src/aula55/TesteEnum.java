package aula55;

import aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiaSemana[] dias = DiaSemana.values();

		for (int i = 0; i < dias.length; i++) {
			System.out.println(" " + dias[i]);
		}
		// acessando com o for melhorado
		for (DiaSemana diaSemana : DiaSemana.values()) {
			System.out.println(diaSemana);
		}

	}

}
