package com.shopzy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testAdicionarProdutoAoPedido() {
        Cliente cliente = new Cliente("Pedro", "12345678900", "pedro@email.com");
        Pedido pedido = new Pedido(cliente);
        Produto produto = new Produto("Smartphone", 2500.0);

        pedido.adicionarProduto(produto);

        assertEquals(1, pedido.getProdutos().size());
        assertTrue(pedido.getProdutos().contains(produto));
    }

    @Test
    public void testCalcularTotalPedido() {
        Cliente cliente = new Cliente("Pedro", "12345678900", "pedro@email.com");
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarProduto(new Produto("Smartphone", 2500.0));
        pedido.adicionarProduto(new Produto("Fone Bluetooth", 150.0));

        assertEquals(2650.0, pedido.calcularTotal());
    }

    @Test
    public void testRealizarPagamento() {
        Cliente cliente = new Cliente("Pedro", "12345678900", "pedro@email.com");
        Pedido pedido = new Pedido(cliente);

        assertFalse(pedido.isPago());
        pedido.realizarPagamento();
        assertTrue(pedido.isPago());
    }
}
