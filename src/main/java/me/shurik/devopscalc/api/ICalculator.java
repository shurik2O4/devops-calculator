package me.shurik.devopscalc.api;

import me.shurik.devopscalc.Calculator;

public interface ICalculator {
    static ICalculator getInstance() {
        return Calculator.INSTANCE;
    }

    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}