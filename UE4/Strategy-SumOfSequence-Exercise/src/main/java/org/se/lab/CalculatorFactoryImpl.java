package org.se.lab;

public class CalculatorFactoryImpl implements CalculatorFactory{

    @Override
    public Calculator createCalculator(TimeComplexity strategy) {
        if (strategy == TimeComplexity.CONSTANT) {
            return new CalculatorImplFast();
        } else if (strategy == TimeComplexity.LINEAR){
            return new CalculatorImplSlow();
        } else {
            throw new IllegalArgumentException("no match");
        }
    }
}
