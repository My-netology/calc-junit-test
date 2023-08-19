package org.example;

public class Calculator {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double minus(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double devide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Внимание! На ноль делить нельзя.");
        }
        return x / y;
    }

    public static double power(double x) {
        return x * x;
    }

    public static double abs(double x) {
        return x < 0 ? -x : x;
    }

    public static boolean isPositiv(double x) {
        return (x > 0);
    }
}