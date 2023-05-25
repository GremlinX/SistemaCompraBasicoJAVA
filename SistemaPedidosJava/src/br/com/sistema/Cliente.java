package br.com.sistema;

public class Cliente {
	private String nome;
	
	// Caso não queria passar atributos ao construtor
	// será necessário atribuir valores aos atributos 
	// manulamente via métodos SETTERS
	public Cliente() {}
	// Sempre que instanciado "Cliente" significa que 
	// será criado uma novo "Cliente" com os atributos
	// passados ao construtor.
	public Cliente(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
