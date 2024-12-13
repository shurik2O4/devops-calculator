package me.shurik.devopscalc.api;

public interface ICalculator {
    static ICalculator getInstance() {
        throw new UnsupportedOperationException("Not implemented");
    }

    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}