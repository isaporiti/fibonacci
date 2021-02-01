package com.codurance.traineeship.katas;

public class Fibonacci {

    public int at(int position) {
        int firstPreceding = 0;
        int secondPreceding = 1;
        int fibonacciResult = 0;

        for (int positionIndex = 0; positionIndex < position; positionIndex++) {
            if (positionIndex == 1) {
                continue;
            }
            fibonacciResult = firstPreceding + secondPreceding;
            firstPreceding = secondPreceding;
            secondPreceding = fibonacciResult;
        }
        return fibonacciResult;
    }
}
