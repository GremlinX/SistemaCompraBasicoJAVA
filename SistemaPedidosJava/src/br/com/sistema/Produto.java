package br.com.sistema;

public class Produto {
	private String nome;
	private float preco;
	
	// Caso não queria passar atributos ao construtor
	// será necessário atribuir valores aos atributos 
	// manulamente via métodos SETTERS
	public Produto() {}
	// Sempre que instanciado "Produto" significa que 
	// será criado uma novo "Produto" com os atributos
	// passados ao construtor.
	public Produto(String nome, float preco) {
		this.setNome(nome);
		this.setPreco(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
