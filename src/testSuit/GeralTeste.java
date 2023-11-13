package testSuit;

import model.ClientePF;

public class GeralTeste {

	public static void main(String[] args) {
		
		ClientePF cliente01 = new ClientePF("Dado","22/04/1998", "estudante", 25);
		System.out.println(cliente01.DataDeNascimento().getDayOfMonth()); // espera-se 22
		System.out.println(cliente01.getIdade()); // espera-se 25
		System.out.println(cliente01.DataDeNascimento().getClass()); //espera-se LocalDate
		
	}

}
