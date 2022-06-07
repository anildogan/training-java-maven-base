package com.codurance.base;

public class FibonacciCalculator {
    public int calculate(int position) {
        if(position==1 || position == 0)
            return position;
        return calculate(position - 1) + calculate(position -2);
    }


}
