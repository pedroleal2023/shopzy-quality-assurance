package com.shopzy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoEstoqueTest {

    @Test
    public void testAdicionarProdutoDisponivel() {
        Estoque estoque = new Estoque();
        Produto produto = new Produto("Monitor", 1500.0);
        estoque.adicionarProduto(produto, 5);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        if (estoque.verificarDisponibilidade(produto, 1)) {
            carrinho.adicionarProduto(produto);
            estoque.reduzirEstoque(produto, 1);
        }

        assertEquals(1, carrinho.quantidadeDeProdutos());
        assertEquals(4, estoque.getProdutos().get(produto));
    }

    @Test
    public void testAdicionarProdutoIndisponivel() {
        Estoque estoque = new Estoque();
        Produto produto = new Produto("Teclado", 300.0);
        estoque.adicionarProduto(produto, 2);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        assertFalse(estoque.verificarDisponibilidade(produto, 3));
    }
}
