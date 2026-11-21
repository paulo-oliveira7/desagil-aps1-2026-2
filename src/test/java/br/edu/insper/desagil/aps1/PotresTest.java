package br.edu.insper.desagil.aps1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PotresTest {
    private Potres p;

    @BeforeEach
    void setUp() {
        p = new Potres();
    }

    @Test
    void calcula1() {
        assertEquals(0, p.calcula(1));
    }

    @Test
    void calcula2() {
        assertEquals(-1, p.calcula(2));
    }

    @Test
    void calcula3() {
        assertEquals(1, p.calcula(3));
    }

    @Test
    void calcula4() {
        assertEquals(-1, p.calcula(4));
    }

    @Test
    void calcula5() {
        assertEquals(-1, p.calcula(5));
    }

    @Test
    void calcula6() {
        assertEquals(-1, p.calcula(6));
    }

    @Test
    void calcula7() {
        assertEquals(-1, p.calcula(7));
    }

    @Test
    void calcula8() {
        assertEquals(-1, p.calcula(8));
    }

    @Test
    void calcula9() {
        assertEquals(2, p.calcula(9));
    }

    @Test
    void calcula10() {
        assertEquals(-1, p.calcula(10));
    }

    @Test
    void calcula26() {
        assertEquals(-1, p.calcula(26));
    }

    @Test
    void calcula27() {
        assertEquals(3, p.calcula(27));
    }

    @Test
    void calcula28() {
        assertEquals(-1, p.calcula(28));
    }

    @Test
    void calcula80() {
        assertEquals(-1, p.calcula(80));
    }

    @Test
    void calcula81() {
        assertEquals(4, p.calcula(81));
    }

    @Test
    void calcula82() {
        assertEquals(-1, p.calcula(82));
    }

    @Test
    void calcula242() {
        assertEquals(-1, p.calcula(242));
    }

    @Test
    void calcula243() {
        assertEquals(5, p.calcula(243));
    }

    @Test
    void calcula244() {
        assertEquals(-1, p.calcula(244));
    }
}
