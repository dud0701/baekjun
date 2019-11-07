package com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/** 쇠막대기
 * */
public class boj_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<Integer>();

        String sentence = br.readLine();
        int result = 0;

        for(int i=0;i < sentence.length(); i++){
            char what = sentence.charAt(i);

            if(what == '('){
                s.push(i);
            }else if(what == ')'){
                int gap = i - s.pop();
                //레이져가 아니다.
                if(gap > 1){
                    result += 1;
                }else{ //레이져다.
                    int divide = s.size();
                    result += divide;
                }
            }
        }

        System.out.println(result);

    }
}
