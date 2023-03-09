package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    void summ() {
        Math math = new Math();
        int res = math.summ(5, 7);
        assert res == 12 : "Sum don't work!";
    }
}