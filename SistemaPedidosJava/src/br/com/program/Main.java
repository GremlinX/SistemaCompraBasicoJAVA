package br.com.program;

import br.com.sistema.Carrinho;
import br.com.sistema.Cliente;
import br.com.sistema.ItemPedido;
import br.com.sistema.Pedido;
import br.com.sistema.Produto;

public class Main {

	public static void main(String[] args) {
		// Testando se o programa está funcionando corretamente
		// SEM UTILIZAR OS MÉTODOS SETTER para atriubuir valores
		// aos objetos.
		// OBS.: Uma vez instanciada uma classe, ela passa a se
		// chamar de OBJETO.
		Cliente cliente01 = new Cliente("João");
		Cliente cliente02 = new Cliente("Maria");
		
		Produto produto01 = new Produto("Camiseta", 39.90f);
		Produto produto02 = new Produto("Calça", 90.00f);
		
		ItemPedido item1 = new ItemPedido(produto01, 2);
        ItemPedido item2 = new ItemPedido(produto02, 1);
        
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);
        
        Pedido pedido = new Pedido(cliente01, carrinho);
        
        System.out.println(pedido);
	}
}
