package org.se.lab;

class CalculatorImplSlow implements Calculator
{
	/*
	 * Time complexity: O(N)
	 * This is the brute force implementation.
	 */
	public int sumOfSequence(int N) {
		int i, sum = 0;
		for(i=1; i<=N; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
