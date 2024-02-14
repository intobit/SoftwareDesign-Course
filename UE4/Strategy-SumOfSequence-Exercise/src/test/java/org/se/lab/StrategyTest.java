package org.se.lab;

import org.junit.Assert;
import org.junit.Test;


public class StrategyTest
{
	private CalculatorFactory factory = new CalculatorFactoryImpl();

	@Test
	public void testSlowImpl()
	{
		Calculator calc = factory.createCalculator(TimeComplexity.LINEAR);
		int result = calc.sumOfSequence(5);
		Assert.assertEquals(15, result);
	}

	@Test
	public void testFastImpl()
	{
		Calculator calc = factory.createCalculator(TimeComplexity.CONSTANT);
		int result = calc.sumOfSequence(5);
		Assert.assertEquals(15, result);
	}
}
