package com.shopzy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    public void testCriacaoPagamento() {
        Pagamento pagamento = new Pagamento(Pagamento.MetodoPagamento.PIX, 1200.0);

        assertEquals(Pagamento.MetodoPagamento.PIX, pagamento.getMetodo());
        assertEquals(1200.0, pagamento.getValor());
    }
}
