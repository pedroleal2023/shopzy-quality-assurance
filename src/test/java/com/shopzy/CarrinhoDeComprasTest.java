package com.shopzy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTest {

    @Test
    public void testAdicionarProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto = new Produto("Camisa", 50.0);

        carrinho.adicionarProduto(produto);

        assertEquals(1, carrinho.quantidadeDeProdutos());
    }

    @Test
    public void testCalcularTotal() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(new Produto("Camisa", 50.0));
        carrinho.adicionarProduto(new Produto("Calça", 100.0));

        assertEquals(150.0, carrinho.calcularTotal());
    }
}
