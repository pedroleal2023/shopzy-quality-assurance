package com.shopzy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Product> products;

    public CarrinhoDeCompras() {
        this.products = new ArrayList<>();
    }

    public void adicionarProduto(Product product) {
        products.add(product);
    }

    public double calcularTotal() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public int quantidadeDeProdutos() {
        return products.size();
    }
}
