package exercise;

class Sequence {

    public void run(int n) {
        for (int i = 0; i <= n; i++) {
            String v = value(i);
            System.out.println(v);
        }
    }

    public String value(int i) {
        return String.valueOf(i);
    }

}

public class FizzBuzz2 extends Sequence {

    @Override
    public String value(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
        //// or
        // if (i % 15 == 0) { return "FizzBuzz"; }
        // if (i % 3 == 0) { return "Fizz"; }
        // if (i % 5 == 0) { return "Buzz"; }
        // return String.valueOf(i);
    }

    public static void main(String[] args) {
        new FizzBuzz2().run(100);
    }

}