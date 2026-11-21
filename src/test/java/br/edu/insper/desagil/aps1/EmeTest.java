package br.edu.insper.desagil.aps1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmeTest {
    private Eme e;

    @BeforeEach
    void setUp() {
        e = new Eme();
    }

    @Test
    void constroiPara1() {
        assertEquals(String.join("\n",
                "MM  MM",
                "M MM M",
                "M    M",
                ""), e.constroi(1));
    }

    @Test
    void constroiPara2() {
        assertEquals(String.join("\n",
                "MM    MM",
                "M M  M M",
                "M  MM  M",
                "M      M",
                "M      M",
                ""), e.constroi(2));
    }

    @Test
    void constroiPara3() {
        assertEquals(String.join("\n",
                "MM      MM",
                "M M    M M",
                "M  M  M  M",
                "M   MM   M",
                "M        M",
                "M        M",
                "M        M",
                ""), e.constroi(3));
    }

    @Test
    void constroiPara4() {
        assertEquals(String.join("\n",
                "MM        MM",
                "M M      M M",
                "M  M    M  M",
                "M   M  M   M",
                "M    MM    M",
                "M          M",
                "M          M",
                "M          M",
                "M          M",
                ""), e.constroi(4));
    }

    @Test
    void constroiPara5() {
        assertEquals(String.join("\n",
                "MM          MM",
                "M M        M M",
                "M  M      M  M",
                "M   M    M   M",
                "M    M  M    M",
                "M     MM     M",
                "M            M",
                "M            M",
                "M            M",
                "M            M",
                "M            M",
                ""), e.constroi(5));
    }
}
