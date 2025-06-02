package com.shopzy;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Product> produtos;
    private boolean pago;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.pago = false;
    }

    public void adicionarProduto(Product produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        return produtos.stream()
                .mapToDouble(Product::getPrice)
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

    public List<Product> getProdutos() {
        return produtos;
    }
}
