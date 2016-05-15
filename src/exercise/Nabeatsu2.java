package exercise;

class Sequence2 {

    public void run(int n) {
        for (int i = 0; i <= n; i++) {
            if (condition(n)) { // 条件に一致すれば
                String v = convert(n); // 特定の文字列に変換
                System.out.println(v);
            } else { // そうでなければ
                System.out.println(n); // そのまま出力
            }
        }
    }

    public boolean condition(int n) {
        return true;
    }

    public String convert(int n) {
        return String.valueOf(n);
    }

}

public class Nabeatsu2 extends Sequence2 {

    @Override
    public boolean condition(int n) {
        if (n % 3 == 0) {
            return true;
        }
        if (String.valueOf(n).indexOf('3') >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public String convert(int n) {
        return "Baka!";
    }

    public static void main(String[] args) {
        new Nabeatsu2().run(100);
    }

}
