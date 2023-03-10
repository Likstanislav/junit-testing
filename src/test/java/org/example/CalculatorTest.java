package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
    Calculator calculator = null;

    ICalculator iCalculator = mock(ICalculator.class);

    @BeforeAll
    public void setUp() {
        calculator = new Calculator(iCalculator);
    }

    @Test
    public void testMult() {
        when(iCalculator.add(2,3)).thenReturn(5);
        assertEquals(10, calculator.mult(2,3));
        verify(iCalculator).add(2,3);
    }
}
