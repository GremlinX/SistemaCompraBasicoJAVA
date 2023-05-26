package br.com.sistema;

public class Cliente {
	private String nome;
	private boolean isVIP;
	
	// Caso não queria passar atributos ao construtor
	// será necessário atribuir valores aos atributos 
	// manulamente via métodos SETTERS
	public Cliente() {}
	// Sempre que instanciado "Cliente" significa que 
	// será criado uma novo "Cliente" com os atributos
	// passados ao construtor.
	public Cliente(String nome, boolean isVIP) {
		this.setNome(nome);
		this.setVIP(isVIP);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isVIP() {
		return isVIP;
	}
	
	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}
}
