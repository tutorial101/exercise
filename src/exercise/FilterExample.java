package exercise;

import java.util.List;
import java.util.ArrayList;


class Filter<T> {

    public List<T> copy(List<T> list) {
        List<T> newlist = new ArrayList<T>();
        for (T x: list) {
            newlist.add(x);
        }
        return newlist;
    }
    
    public List<T> filter(List<T> list) {
        List<T> newlist = new ArrayList<T>();
        for (T x: list) {
            if (condition(x)) {
                T v = value(x);
                newlist.add(v);
            }
        }
        return newlist;
    }
    
    public boolean condition(T x) {
        return true;
    }
    
    public T value(T x) {
        return x;
    }

}


class NumberFilter extends Filter<Integer> {

    @Override
    public boolean condition(Integer x) {
        return x % 2 == 1;   // 奇数だけを選ぶ
    }
    
    @Override
    public Integer value(Integer x) {
        return 2 * x;   // 2倍の数に変換する
    }

}


public class FilterExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10); list.add(15); list.add(20); list.add(25); list.add(30);
        //
        //Filter<Integer> filter = new Filter<Integer>();
        //List<Integer> newlist = filter.copy(list);
        //for (int x: newlist) {
        //    System.out.println(x);
        //}
        //
        NumberFilter filter2 = new NumberFilter();
        for (int x: filter2.filter(list)) {
            System.out.println(x);
        }
    }

}
