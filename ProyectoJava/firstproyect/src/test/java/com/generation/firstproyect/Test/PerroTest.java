package com.generation.firstproyect.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.firstproyect.models.Perro;


class PerroTest {
    @Test
    void testTruco(){
        Perro perro = new Perro();
        assertEquals("doy la pat", perro.truco("da la pata"));

    }
}
