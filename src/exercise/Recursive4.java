/**
  問題: 

  "( a b (c d (e) f g))"
  という文字列に含まれるアルファベットを一行ずつ出力しなさい。
  ただし、「(」でインデントを2つ増やし、「)」でインデントを2つ減らしなさい。
  出力例:

    a
    b
      c
      d
        e
      f
      g
      
 */
package exercise;

public class Recursive4 {
    
    public void printChars(String str) {
        _printChars(str, 0, 0);
    }
    
    private int _printChars(String str, int index, int depth) {
        //System.out.println("*** debug: >> index=" + index + ", str.charAt(index)='" + str.charAt(index) + "', depth=\"" + depth + "\"");
        for (int i = index; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                i = _printChars(str, i+1, depth+1);
                //System.out.println("*** debug: << i=" + i + ", str.charAt(i)='" + str.charAt(i));
            } else if (c == ')') {
                return i;
            } else if (Character.isAlphabetic(c)) {
                printIndent(depth);
                System.out.println(c);
            }
        }
        return str.length();
    }
    
    private void printIndent(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }

    public static void main(String[] args) {
        Recursive4 obj = new Recursive4();
        String data = "( a b (c d (e) f g))";
        obj.printChars(data);
    }
    
}
