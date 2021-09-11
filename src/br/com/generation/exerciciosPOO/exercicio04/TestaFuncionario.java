package br.com.generation.exerciciosPOO.exercicio04;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Patrícia");
		funcionario1.setCpf("000.000.000-00");
		funcionario1.setEndereco("Rua do amor, 000");
		funcionario1.setTelefone("(00) 00000-0000");
		funcionario1.setCargo("Desenvolvedora de software Jr.");
		funcionario1.setCodigoRegistro(000000);
		funcionario1.setSalario(5100.00);
		
		System.out.println("Nome:" + funcionario1.getNome());
		System.out.println("CPF: " + funcionario1.getCpf());
		System.out.println("Endereço: " + funcionario1.getEndereco());
		System.out.println("Telefone: " + funcionario1.getTelefone());
		System.out.println("Cargo: " + funcionario1.getCargo());
		System.out.println("Registro: " + funcionario1.getCodigoRegistro());
		System.out.println("Salário: " + funcionario1.getSalario());

	}

}
