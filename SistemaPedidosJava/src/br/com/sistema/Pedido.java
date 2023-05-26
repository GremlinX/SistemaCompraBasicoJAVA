package br.com.sistema;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Pedido {
	private Cliente cliente;
	private Carrinho carrinho;
	private LocalDateTime dataPedido;
	
	public Pedido(Cliente cliente, Carrinho carrinho) {
		this.cliente = cliente;
        this.carrinho = carrinho;
        this.dataPedido = LocalDateTime.now();
    }

	private float atribuirDesconto() {
		if(cliente.isVIP()) {
			return 0.05f;
		}
		return 0f;
	}
	
	// Este método "toString()" permite formar a impressão do 
	// seu objeto conforme você desejar.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("- - - Novo Pedido - - - \n");
		sb.append("Cliente: " + cliente.getNome() + "\n");
		sb.append("Produtos: " + "\n");
		for (ItemPedido c : carrinho.itens) {
			sb.append(c);
		}
		sb.append("Total: " + (carrinho.calcularTotal() * (1 - atribuirDesconto())) + "\n");
		sb.append("Relizado em: " + dataPedido + "\n");
		sb.append("- - - Assinatura - - -");
		return sb.toString();
	}
}
