package br.com.testandoservlet.servlet.models;

public class Empresa {
	private int id;
	private String nome;

	public Empresa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
