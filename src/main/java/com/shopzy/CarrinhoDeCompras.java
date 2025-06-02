package com.shopzy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        return produtos.stream()
                .mapToDouble(Produto::getPrice)
                .sum();
    }

    public int quantidadeDeProdutos() {
        return produtos.size();
    }
}
