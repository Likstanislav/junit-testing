package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

    @Test
    void summ() {
        Math math = new Math();

        assertEquals(12, math.summ(5, 7), "Addition does't work");
//        assert res == 12 : "Sum don't work!";
    }
    @Test
    public void testArray() {
        Math math = new Math();
        int[] arr = math.setArray(4,6,8,10,0);
        int[] expected = {4,6,8,10,0};
        assertArrayEquals(arr,expected);
    }

    @Test
    public void testDivide() {
        Math math = new Math();
        assertEquals(5, math.divide(10,2), "Division does't work");
        assertThrows(ArithmeticException.class, () -> math.divide(5,0));
    }
}