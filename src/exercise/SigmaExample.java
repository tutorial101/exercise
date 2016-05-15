package exercise;


class Sigma {

    public int calc(int start, int end) {
        int total = 0;
        for (int x = start; x <= end; x++) {
            total += func(x);
        }
        return total;
    }

    public int func(int x) {
        return x;
    }

}


class SquareSigma extends Sigma {

    @Override
    public int func(int x) {
        return x * x;
    }

}


public class SigmaExample {

    public static void main(String[] args) {
        Sigma sigma = new SquareSigma();
        System.out.println(sigma.calc(1,  5));
    }

}
