package com.shopzy;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    public boolean verificarDisponibilidade(Produto produto, int quantidade) {
        return produtos.getOrDefault(produto, 0) >= quantidade;
    }

    public void reduzirEstoque(Produto produto, int quantidade) {
        if (verificarDisponibilidade(produto, quantidade)) {
            produtos.put(produto, produtos.get(produto) - quantidade);
        } else {
            System.out.println("Estoque insuficiente para " + produto.getName());
        }
    }

    public Map<Produto, Integer> getProdutos() {
        return produtos;
    }
}
