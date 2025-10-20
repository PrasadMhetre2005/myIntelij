package DSAbyShraddha.Recursion;

public class fibonacciPrint {
    public static int printfib(int fibNum) {
        if (fibNum == 0 || fibNum == 1) {
            return fibNum;
        }
        int fib1 = printfib(fibNum - 1);
        int fib2 = printfib(fibNum - 2);
        int fib = fib1 + fib2;
        return fib;
    }

    public static void main(String[] args) {
        int fibNum = 7;
        System.out.println(printfib(fibNum));
    }
}
