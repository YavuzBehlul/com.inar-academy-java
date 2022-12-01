package chapters.chapter_13.exercise_08;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    /** @Override
    public Object clone() throws CloneNotSupportedException {
        MyStack clone = (MyStack) super.clone();
        clone.list = copyList();
        return clone;
    }

    private ArrayList<Object> copyList() {
        ArrayList<Object> copyList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
            copyList.add(list.get(i));

        return copyList;
    }*/

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}
