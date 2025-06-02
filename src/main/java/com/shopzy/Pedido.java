package com.shopzy;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private boolean pago;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.pago = false;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        return produtos.stream()
                .mapToDouble(Produto::getPrice)
                .sum();
    }

    public void realizarPagamento() {
        this.pago = true;
    }

    public boolean isPago() {
        return pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
