package com.me;

import java.io.*;
import java.util.Stack;

public class reverseLetters2 {
    public static void main(String[] args) throws IOException {

        boolean tag = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> s = new Stack<>();


        String sentence = br.readLine();

        for(int i = 0; i < sentence.length();i++){
            char letter = sentence.charAt(i);
            if(letter == '<') {
                tag = true;
                print(s);
                System.out.print(letter);
            }else if(letter == '>'){
                tag = false;
                System.out.print(letter);

            }else if(tag){
                System.out.print(letter);
            }else{
                if(letter == ' '){
                    print(s);
                    System.out.print(" ");
                }else{
                    s.push(letter);
                }
            }
        }

        print(s);

    }

    public static void print(Stack<Character> s){
        while(!s.empty()){
            System.out.print(s.pop());
        }
    }
}
