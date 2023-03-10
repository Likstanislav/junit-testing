package org.example;

public class Calculator {
    ICalculator iCalculator;

    public Calculator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public int mult(int a, int b) {
        return iCalculator.add(a, b) * 2;
//        return (a + b) * 2;
    }
}
