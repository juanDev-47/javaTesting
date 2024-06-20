package org.juandev47.functional;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {



    @Test
    public void testSumar() {
//        Given
        Example e = new Example();
        int num1 = 1;
        int num2 = 2;

//        When
        int resultado = e.sumar(num1, num2);

//        Then
        assertEquals(3, resultado);
    }

    @Test
    public void testCheckPositivo() {
        // given
        Example e = new Example();
        int number = 1;

        // when
        boolean result = e.checkPositivo(number);

        // then
        assertTrue(result);

    }

}
