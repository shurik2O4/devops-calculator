package me.shurik.devopscalc;

import me.shurik.devopscalc.api.ICalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        // Read A and B
        System.out.print("Enter A: ");
        double a = Double.parseDouble(console.readLine());
        System.out.print("Enter B: ");
        double b = Double.parseDouble(console.readLine());

        // Read operation
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = console.readLine();

        // Calculate
        ICalculator calculator = ICalculator.getInstance();
        double result;
        switch (operation) {
            case "+": result = calculator.add(a, b); break;
            case "-": result = calculator.subtract(a, b); break;
            case "*": result = calculator.multiply(a, b); break;
            case "/": result = calculator.divide(a, b); break;
            default:
                System.out.println("Unknown operation");
                return;
        }

        // Print result
        System.out.println("Result: " + result);
    }
}