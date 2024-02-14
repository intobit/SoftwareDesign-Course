package org.se.lab;

public interface CalculatorFactory {
    Calculator createCalculator(TimeComplexity strategy);
}
