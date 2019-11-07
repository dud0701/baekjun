package com.company.ex;

import java.util.*;

/**
 * 5
 * 1
 * 2
 * 5
 * 3
 * 4*/
public class StackSequence {
    public static void solve(int[] a) {
        int n = a.length;
        Stack<Integer> stack = new Stack<Integer>();
        int m = 0;
        StringBuilder sb = new StringBuilder();
        for(int x : a) {
            if (x > m) {
                while (x > m) {
                    stack.push(++m);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("test");
                if (stack.peek() != x) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
                sb.append("-\n");
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        solve(a);
    }
}
