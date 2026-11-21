package br.edu.insper.desagil.aps1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeibnizTest {
    private static final double DELTA = 0.000001;

    private Leibniz l;

    @BeforeEach
    void setUp() {
        l = new Leibniz();
    }

    @Test
    void aproximaPara1() {
        assertEquals(4.000000, l.aproxima(1), DELTA);
    }

    @Test
    void aproximaPara2() {
        assertEquals(2.666666, l.aproxima(2), DELTA);
    }

    @Test
    void aproximaPara3() {
        assertEquals(3.466666, l.aproxima(3), DELTA);
    }

    @Test
    void aproximaPara4() {
        assertEquals(2.895238, l.aproxima(4), DELTA);
    }

    @Test
    void aproximaPara5() {
        assertEquals(3.339682, l.aproxima(5), DELTA);
    }

    @Test
    void aproximaPara6() {
        assertEquals(2.976046, l.aproxima(6), DELTA);
    }

    @Test
    void aproximaPara7() {
        assertEquals(3.283738, l.aproxima(7), DELTA);
    }

    @Test
    void aproximaPara8() {
        assertEquals(3.017071, l.aproxima(8), DELTA);
    }

    @Test
    void aproximaPara9() {
        assertEquals(3.252365, l.aproxima(9), DELTA);
    }

    @Test
    void aproximaPara10() {
        assertEquals(3.041839, l.aproxima(10), DELTA);
    }

    @Test
    void aproximaPara100() {
        assertEquals(3.131592, l.aproxima(100), DELTA);
    }

    @Test
    void aproximaPara1000() {
        assertEquals(3.140592, l.aproxima(1000), DELTA);
    }

    @Test
    void aproximaPara10000() {
        assertEquals(3.141492, l.aproxima(10000), DELTA);
    }

    @Test
    void aproximaPara100000() {
        assertEquals(3.141582, l.aproxima(100000), DELTA);
    }

    @Test
    void aproximaPara1000000() {
        assertEquals(3.141591, l.aproxima(1000000), DELTA);
    }
}
