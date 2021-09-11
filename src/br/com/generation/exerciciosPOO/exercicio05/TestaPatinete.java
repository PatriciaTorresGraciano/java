package br.com.generation.exerciciosPOO.exercicio05;

public class TestaPatinete {

	public static void main(String[] args) {
		
		Patinete patinete1 = new Patinete();
		
		patinete1.setMaterial("Alumínio");
		patinete1.setQuantidadeRodas(3);
		patinete1.setCapacidadeKg(12.5);
		
		System.out.println("Material: " + patinete1.getMaterial());
		System.out.println("Quantidade de Rodas: " + patinete1.getQuantidadeRodas());
		System.out.println("Capacidade: " + patinete1.getCapacidadeKg());

	}

}
