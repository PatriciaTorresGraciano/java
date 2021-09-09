package br.com.generation.exerciciosPOO.exercicio02;

public class TestaAviao {

	public static void main(String[] args) {
		
	Aviao aviao1 = new Aviao();
		
	aviao1.setCompanhia("Latam");
	aviao1.setCapacidade(144);
	aviao1.setModelo("A319");
	aviao1.setTipo("Passeiro");
	
	System.out.println("Companhia do avião: " + aviao1.getCompanhia());
	System.out.println("Tipo do avião: " + aviao1.getTipo());
	System.out.println("Modelo do avião " + aviao1.getModelo());
	System.out.println("Capacidade de passeiro do avião: " + aviao1.getCapacidade());
	
	}

}
