package me.shurik.devopscalc;

import me.shurik.devopscalc.api.ICalculator;

public class Calculator implements ICalculator {
    public static final Calculator INSTANCE = new Calculator();

    private Calculator() {
    }

    @Override
    public double add(double a, double b) {
        return a + a;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
