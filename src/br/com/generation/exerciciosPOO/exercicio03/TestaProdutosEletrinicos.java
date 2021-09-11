package br.com.generation.exerciciosPOO.exercicio03;

public class TestaProdutosEletrinicos {

	public static void main(String[] args) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
	
		produto1.setTipo("Smartphone");
		produto1.setMarca("Samsung");
		produto1.setModelo("Galaxy S20");
		produto1.setCor("Branco");
		produto1.setBateria("5000mAh");
		
		System.out.println("Tipo do Produto: " + produto1.getTipo());
		System.out.println("Marca do produto: " + produto1.getMarca());
		System.out.println("Modelo do produto " + produto1.getModelo());
		System.out.println("Cor do produto: " + produto1.getBateria());
		
	}

}
