package br.edu.insper.desagil.aps1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SenhaTest {
    private Senha s;

    @BeforeEach
    void setUp() {
        s = new Senha();
    }

    @Test
    void maiusculas() {
        assertFalse(s.valida("ABC"));
    }

    @Test
    void maiusculasMinusculas() {
        assertFalse(s.valida("ABCabc"));
    }

    @Test
    void maiusculasMinusculasIntercaladas() {
        assertFalse(s.valida("AaBbCc"));
    }

    @Test
    void maiusculasMinusculasOutros() {
        assertTrue(s.valida("ABCabc1@3"));
    }

    @Test
    void maiusculasMinusculasOutrosIntercaladas() {
        assertTrue(s.valida("Aa1Bb@Cc3"));
    }

    @Test
    void maiusculasOutros() {
        assertFalse(s.valida("ABC1@3"));
    }

    @Test
    void maiusculasOutrosIntercaladas() {
        assertFalse(s.valida("A1B@C3"));
    }

    @Test
    void maiusculasOutrosMinusculas() {
        assertTrue(s.valida("ABC1@3abc"));
    }

    @Test
    void maiusculasOutrosMinusculasIntercaladas() {
        assertTrue(s.valida("A1aB@bC3c"));
    }

    @Test
    void minusculas() {
        assertFalse(s.valida("abc"));
    }

    @Test
    void minusculasMaiusculas() {
        assertFalse(s.valida("abcABC"));
    }

    @Test
    void minusculasMaiusculasIntercaladas() {
        assertFalse(s.valida("aAbBcC"));
    }

    @Test
    void minusculasMaiusculasOutros() {
        assertTrue(s.valida("abcABC1@3"));
    }

    @Test
    void minusculasMaiusculasOutrosIntercaladas() {
        assertTrue(s.valida("aA1bB@cC3"));
    }

    @Test
    void minusculasOutros() {
        assertFalse(s.valida("abc1@3"));
    }

    @Test
    void minusculasOutrosIntercaladas() {
        assertFalse(s.valida("a1b@c3"));
    }

    @Test
    void minusculasOutrosMaiusculas() {
        assertTrue(s.valida("abc1@3ABC"));
    }

    @Test
    void minusculasOutrosMaiusculasIntercaladas() {
        assertTrue(s.valida("a1Ab@Bc3C"));
    }

    @Test
    void outros() {
        assertFalse(s.valida("1@3"));
    }

    @Test
    void outrosMaiusculas() {
        assertFalse(s.valida("1@3ABC"));
    }

    @Test
    void outrosMaiusculasIntercaladas() {
        assertFalse(s.valida("1A@B3C"));
    }

    @Test
    void outrosMaiusculasMinusculas() {
        assertTrue(s.valida("1@3ABCabc"));
    }

    @Test
    void outrosMaiusculasMinusculasIntercaladas() {
        assertTrue(s.valida("1Aa@Bb3Cc"));
    }

    @Test
    void outrosMinusculas() {
        assertFalse(s.valida("1@3abc"));
    }

    @Test
    void outrosMinusculasIntercaladas() {
        assertFalse(s.valida("1a@b3c"));
    }

    @Test
    void outrosMinusculasMaiusculas() {
        assertTrue(s.valida("1@3abcABC"));
    }

    @Test
    void outrosMinusculasMaiusculasIntercaladas() {
        assertTrue(s.valida("1aA@bB3cC"));
    }
}
