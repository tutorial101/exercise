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
    
    /** Loop **/
    public int fib2(int n) {
        int x = 0;
        int y = 1;
        for (int i = 0; i < n; i++) {
            int _x = x; int _y = y;
            x = _y;
            y = _x + _y;
            // or
            //int tmp = y; y = x + y; x = tmp;
        }
        return x;
    }
    
    public static void main(String[] args) {
        int result = new Recursive3().fib(10);
        System.out.println(result);   //=> 55
        int result2 = new Recursive3().fib2(10);
        System.out.println(result2);
    }

}
