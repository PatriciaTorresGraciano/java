package br.com.generation.exerciciosPOO.exercicio06;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setBanco("Itaú");
		conta1.setTipoConta("Corrente");
		conta1.setAgencia("000");
		conta1.setNumeroConta("00000000");
		conta1.setNomeDestino("Patrícia Graciano");
		conta1.setCpfDestino("000.000.000-00");
		
		System.out.println("Banco: " + conta1.getBanco());
		System.out.println("Tipo de conta: " + conta1.getTipoConta());
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Número da conta: " + conta1.getNumeroConta());
		System.out.println("Nome do beneficiário: " + conta1.getNomeDestino());
		System.out.println("CPF do beneficiário: " + conta1.getCpfDestino());
		
	}

}
