package com.witrang2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyStack {
    private List<Integer> lst = new ArrayList<Integer>();

    public void push(int value) { lst.add(value); }

    public int pop() {
        int v = lst.get(lst.size() - 1);
        lst.remove(lst.size() - 1);
        return v;
    }

    public int size() { return lst.size(); }

    public boolean isEmpty() {
        return lst.size() == 0;
    }

    public MyStack() {}

}
