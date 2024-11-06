public class Fibonacci {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
    public static int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
    public static void printFibonacciSeries(int n, boolean recursive) {
        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            if (recursive) {
                System.out.print(fibonacciRecursive(i) + " ");
            } else {
                System.out.print(fibonacciNonRecursive(i) + " ");
            }
        }

        System.out.println(); 
    }

    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Using Recursion:");
        printFibonacciSeries(n, true);
        System.out.println("Using Non-Recursion (Iteration):");
        printFibonacciSeries(n, false);
    }
}
