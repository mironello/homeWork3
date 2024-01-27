package org.example;

public class SumCalculator  {
    int number;

    public int sum(int n) {
        int result = 0;
        if(n<1){
            throw new IllegalArgumentException("n can not take 0 value");
        }
           for (int i = 0; i <= n; i++) {
               result += i;
           }

        return result;
    }
}
