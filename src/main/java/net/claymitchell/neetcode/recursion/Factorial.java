package net.claymitchell.neetcode.recursion;

public class Factorial {
    public static int calculateFactorial(int n) {
        if(n <= 1) {
            return 1;
        }
        int sub = calculateFactorial(n-1);
        int value = n * sub;
        return value;
    }
}
