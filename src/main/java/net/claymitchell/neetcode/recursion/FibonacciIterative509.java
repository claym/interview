package net.claymitchell.neetcode.recursion;

public class FibonacciIterative509 {
    public int fib(int n) {
        if(n<=1) {
            return n;
        }
        int p1 = 1;
        int p2 = 0;
        for(int i=2; i<n; i++) {
            int tmp = p1 + p2;
            p2 = p1;
            p1 = tmp;
        }
        return p1 + p2;
    }
}
