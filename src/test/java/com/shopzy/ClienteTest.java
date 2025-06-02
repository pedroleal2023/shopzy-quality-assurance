package com.shopzy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testCriacaoCliente() {
        Cliente cliente = new Cliente("Pedro", "12345678900", "pedro@email.com");

        assertEquals("Pedro", cliente.getNome());
        assertEquals("12345678900", cliente.getCpf());
        assertEquals("pedro@email.com", cliente.getEmail());
    }
}
