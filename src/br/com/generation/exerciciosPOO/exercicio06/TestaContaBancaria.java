package br.com.generation.exerciciosPOO.exercicio06;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setBanco("Ita�");
		conta1.setTipoConta("Corrente");
		conta1.setAgencia("000");
		conta1.setNumeroConta("00000000");
		conta1.setNomeDestino("Patr�cia Graciano");
		conta1.setCpfDestino("000.000.000-00");
		
		System.out.println("Banco: " + conta1.getBanco());
		System.out.println("Tipo de conta: " + conta1.getTipoConta());
		System.out.println("Ag�ncia: " + conta1.getAgencia());
		System.out.println("N�mero da conta: " + conta1.getNumeroConta());
		System.out.println("Nome do benefici�rio: " + conta1.getNomeDestino());
		System.out.println("CPF do benefici�rio: " + conta1.getCpfDestino());
		
	}

}
