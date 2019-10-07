package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class josephers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();

        int n = sc.nextInt();
        int t = sc.nextInt();

        int []arr = new int[n];
        int []result = new int[n];
        int m = 1;

        for(int i=0;i<n;i++){
            queue.add(i+1);
        }
        int a = 0;

        while(!queue.isEmpty()){
            if(m == t){
                result[a] = queue.poll();
                a++;
                m = 1;
            }else{
                queue.add(queue.poll());
                m++;
            }

        }
        System.out.print("<");
        for(int j =0;j<result.length-1;j++){
            System.out.print(result[j]+", ");
        }
        System.out.print(result[n-1] + ">");
    }
}
