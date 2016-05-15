package exercise;

import java.util.List;
import java.util.ArrayList;


class Filter {

    public List<Integer> copy(List<Integer> list) {
        List<Integer> newlist = new ArrayList<Integer>();
        for (int x: list) {
            newlist.add(x);
        }
        return newlist;
    }

}


public class FilterExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10); list.add(20); list.add(30);
        //
        Filter filter = new Filter();
        List<Integer> newlist = filter.copy(list);
        for (int x: newlist) {
            System.out.println(x);
        }
    }

}
