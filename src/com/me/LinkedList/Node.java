package com.me.LinkedList;

public class Node {

    private Object data;
    private Node next;

    public Node(Object input) {
        this.data = input;
    }

    public Node(String data, Node link) {
        this.data = data;
        this.next = link;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
