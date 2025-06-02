package com.shopzy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoPagamentoTest {

    @Test
    public void testProcessoCompletoDeCompra() {
        Cliente cliente = new Cliente("Pedro", "12345678900", "pedro@email.com");
        Pedido pedido = new Pedido(cliente);
        Produto produto1 = new Produto("Notebook", 3500.0);
        Produto produto2 = new Produto("Mouse", 150.0);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);

        assertEquals(3650.0, pedido.calcularTotal());

        Pagamento pagamento = new Pagamento(Pagamento.MetodoPagamento.PIX, pedido.calcularTotal());
        pagamento.processarPagamento();

        pedido.realizarPagamento();
        assertTrue(pedido.isPago());
    }
}
