package com.shopzy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {

    @Test
    public void testAdicionarProdutoAoEstoque() {
        Estoque estoque = new Estoque();
        Product produto = new Product("Teclado Mecânico", 300.0);

        estoque.adicionarProduto(produto, 5);

        assertTrue(estoque.verificarDisponibilidade(produto, 3));
        assertFalse(estoque.verificarDisponibilidade(produto, 10));
    }

    @Test
    public void testReduzirEstoque() {
        Estoque estoque = new Estoque();
        Product produto = new Product("Monitor", 1500.0);
        estoque.adicionarProduto(produto, 10);

        estoque.reduzirEstoque(produto, 3);
        assertTrue(estoque.verificarDisponibilidade(produto, 7));
        assertFalse(estoque.verificarDisponibilidade(produto, 8));
    }
}
