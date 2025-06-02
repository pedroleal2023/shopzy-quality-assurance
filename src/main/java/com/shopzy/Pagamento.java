package com.shopzy;

public class Pagamento {
    public enum MetodoPagamento { CARTAO, BOLETO, PIX }

    private MetodoPagamento metodo;
    private double valor;

    public Pagamento(MetodoPagamento metodo, double valor) {
        this.metodo = metodo;
        this.valor = valor;
    }

    public MetodoPagamento getMetodo() {
        return metodo;
    }

    public double getValor() {
        return valor;
    }

    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " via " + metodo + " realizado com sucesso.");
    }
}
