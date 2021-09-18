package br.com.generation.exerciciosPOOHeranca.exercicio03;

public class Produto {

	private long id;
	private String nome;
	private double quantidade; 
	private String categoria;
	
	public Produto() {
		super();
	}

	public Produto(long id, String nome, double quantidade, String categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}

	public Produto(String nome, double quantidade, String categoria) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
