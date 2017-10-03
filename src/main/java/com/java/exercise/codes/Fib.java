package com.java.exercise.codes;

import java.util.Arrays;

public class Fib {

	public static void main(String[] args) {
		
		int length = 100;
	    long[] series = new long[length];
	    series[0] = 1;
	    series[1] = 1;
	    for (int i = 2; i < length; i++) {
	      series[i] = series[i - 1] + series[i - 2];
	    }
	    System.out.print(Arrays.toString(series));
	}

}
