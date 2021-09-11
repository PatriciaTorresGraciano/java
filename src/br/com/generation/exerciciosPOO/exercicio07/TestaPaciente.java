package br.com.generation.exerciciosPOO.exercicio07;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Patrícia");
		paciente1.setCpf("000.000.000-00");
		paciente1.setEndereco("Rua da Felicidade, 000");
		paciente1.setTelefone("(00) 00000-0000");
		paciente1.setConvenio("Bradesco Saúde");
		
		System.out.println("Nome :" + paciente1.getNome());
		System.out.println("CPF: " + paciente1.getCpf());
		System.out.println("Endereço: " + paciente1.getEndereco());
		System.out.println("Telefone: " + paciente1.getTelefone());
		System.out.println("Convênio: " + paciente1.getConvenio());

	}

}
