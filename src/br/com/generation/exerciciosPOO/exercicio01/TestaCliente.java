package br.com.generation.exerciciosPOO.exercicio01;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Patrícia");
		cliente1.setSexo("Feminino");
		cliente1.setIdade(24);
		cliente1.setCpf("111.111.111-11");
		cliente1.setEmail("patricia.dstorres@hotmail.com");
		cliente1.setTelefone("(11) 91111-1111");
		cliente1.setEndereco("Rua da Felicidade");
		
		System.out.println("Nome cliente:" + cliente1.getNome());
		System.out.println("Sexo cliente:" + cliente1.getSexo());
		System.out.println("Idade cliente:" + cliente1.getIdade());
		System.out.println("CPF cliente:" + cliente1.getCpf());
		System.out.println("E-mail cliente:" + cliente1.getEmail());
		System.out.println("Telefone cliente:" + cliente1.getTelefone());
		System.out.println("Endereço cliente:" + cliente1.getEndereco());
		
		
	}

}
