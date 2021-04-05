package org.example.ejemplos.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("andres", new BigDecimal("1000.12345"));
//        cuenta.setPersona("andres");
        String esperado = "andres";
        String real = cuenta.getPersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("andres"));
    }

    @Test
    void testSaldoCuenta() {
        Cuenta cuenta = new Cuenta("andres", new BigDecimal("1000.12345"));
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    void testReferenciaCuenta() {
       Cuenta cuenta1 = new Cuenta("john doe", new BigDecimal("8900.9997"));
       Cuenta cuenta2 = new Cuenta("john doe", new BigDecimal("8900.9997"));
       assertNotEquals(cuenta1, cuenta2);
    }
}