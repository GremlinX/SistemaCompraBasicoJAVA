package br.com.sistema;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	// Agora aqui sim é onde vai ter a lista de itens 
	// de pedidos:
	List<ItemPedido> itens = new ArrayList<ItemPedido>();
	
	public Carrinho() {}
	// Sempre que instanciado "Carrinho" significa que 
	// será criado uma novo "Carrinho" com os atributos
	// passados ao construtor.
	// Neste caso é uma lista, pode ser vazia ou preenchida.
	public Carrinho(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
	public List<ItemPedido> getItens() {
        return itens;
    }
	
	public void adicionarItem(ItemPedido item) {
		this.itens.add(item);
	}

	public void removerItem(ItemPedido item) {
		this.itens.remove(item);
	}
	
	// Este método é responsável por calcular o valor 
	// de todos os itens que estiverem no carrinho
	// através de um loop especial "forEach".
	// Aqui é percorrido o "ItemPedido" para podermos
	// acessar o seu método "calcularSubtotal()", que 
	// retorna o valor de apenas 1 item.
	// Como fazemos um loop, vamos pegar 1 a 1 cada
	// pedido e somar seus valores para obtermos um 
	// valor total.
	public float calcularTotal() {
		float total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}
