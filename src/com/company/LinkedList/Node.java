package com.company.LinkedList;

public class Node {

    String data;
    Node link;


    public Node() {
        this.data = null;
        this.link = null;
    }

    public Node(String data) {
        this.data = data;
    }

    public Node(String data, Node link) {
        this.data = data;
        this.link = link;
    }

    public String getData() {
        return data;
    }
}
