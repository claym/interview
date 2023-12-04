package net.claymitchell.neetcode.recursion;

public class FibonacciRecursive509 {
    public int fib(int n) {
        if(n <= 1) {
            return n;
        }
        int val1 = fib(n-1);
        int val2 = fib(n-2);
        return val1 + val2;
    }
}
