package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class MathTest {
    static Math math = null;

    @BeforeAll
    public static void setUp() {
        math = new Math();
    }

    @AfterAll
    public static void tearDown() {
        math = null;
    }

    @Test
//    @RepeatedTest(2)
    @Tag("Array")
    public void testArray() {
        int[] arr = math.setArray(4, 6, 8, 10, 0);
        int[] expected = {4, 6, 8, 10, 0};
        assertArrayEquals(arr, expected);
    }


    @Nested
    @DisplayName("Test for number")
    class simpleMath {
        @Test
        @Tag("Number")
        public void testDivide() {
            assertEquals(5, math.divide(10, 2), "Division does't work");
            assertThrows(ArithmeticException.class, () -> math.divide(5, 0));
        }

        @Test
//        @Disabled
        @DisplayName("Name test")
        @Tag("Number")
        void summ() {
            assertAll(
                    () -> assertEquals(12, math.summ(5, 7), "Addition does't work"),
                    () -> assertNotEquals(12, 10)
            );
//        assert res == 12 : "Sum don't work!";
        }

    }
}