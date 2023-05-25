package br.com.sistema;

public class ItemPedido {
	public Produto produto;
	public int quantidade;

	// Sempre que instanciado "ItemPedido" significa que
	// será criado uma novo "ItemPedido" com os atributos
	// passados ao construtor.
	// ItemPedido contitui de ter produtos e quantidades deste
	// mesmo produto.
	// Imagine como se "ItemPedido" fosse apenas um
	// item do pedido.
	public ItemPedido(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	// SOBRE OS GETTERS E SETTERS
	// Apenas usaremos os GETTERS nesta classe
	// pois as configurações dos produtos são feitas
	// diretamente na classe "Produto"
	// Tudo bem você configurar um setter aqui,
	// vai funcionar normalmente, mas
	// pensa que os produtos no mundo real
	// são definido em "Produtos" e não em "ItemPedido"
	public Produto getProduto() {
		return produto;
	}
	
	public int getQuantidade() {
        return quantidade;
    }
	
	// Método para calcular o total do item do pedido
	// Lembrando que é apenas 1 item ainda!
	public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }
	
	// Método toString permite você escrever a sua classe conforme 
	// seu gosto, isto é, você pode imprimir seu objeto conforme 
	// o escopo abaixo:
	@Override
	public String toString() {
		return "" + quantidade 
				+ "x "
				+ produto.getPreco()
				+ " "
				+ produto.getNome() 
				+ " = " 
				+ String.format("%.2f", calcularSubtotal())
				+ "\n";
	}
	
}