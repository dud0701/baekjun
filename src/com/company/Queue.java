package com.company;

import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] que = new int[n];
        int begin = 0;
        int end = 0;

        while(n-- > 0){
            String command = sc.next();

            if(command.equals("push")){
                int num = Integer.parseInt(sc.next());
                que[end++ ] = num;
            }else if(command.equals("pop")){
                if(begin == end){
                    System.out.println("-1");
                }else{
                    System.out.println(que[begin]);
                    begin += 1;
                }
            }else if(command.equals("size")){
                System.out.println(end-begin);
            }else if(command.equals("front")){
                if(begin==end){
                    System.out.println("-1");
                }else{
                    System.out.println(que[begin]);
                }
            }else if(command.equals("back")){
                if(begin==end){
                    System.out.println("-1");
                }else{
                    System.out.println(que[end-1]);
                }
            }else if(command.equals("empty")){
                if(begin==end){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }

            }
        }

    }

}
