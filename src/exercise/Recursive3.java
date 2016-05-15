package exercise;

public class Recursive3 {
    
    /** Fibonacci sequence */
    public int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
    
    public static void main(String[] args) {
        int result = new Recursive3().fib(10);
        System.out.println(result);   //=> 55
    }

}
