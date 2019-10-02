package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
 * D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
 * B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
 * 삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
 * P $	$라는 문자를 커서 왼쪽에 추가함
 * */

/*1406*/
public class Editor {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String sentence = br.readLine();

        for(char ch : sentence.toCharArray()){
            left.push(ch);
        }

        int n = Integer.parseInt(br.readLine());

        while(n -- > 0){
            String[] command = br.readLine().split(" ");
            char letter = command[0].charAt(0);

            if(letter == 'L'){
                if(!left.empty()){
                    right.push(left.peek());
                    left.pop();
                }
            }else if(letter == 'D'){
                if(!right.empty()){
                    left.push(right.peek());
                    right.pop();
                }

            }else if(letter == 'B'){
                if(!left.empty()){
                    left.pop();
                }

            }else if(letter == 'P'){
                char character = command[1].charAt(0);
                left.push(character);
            }
        }

        while(!left.empty()){
            right.push(left.pop());
        }

        while(!right.empty()){
            System.out.print(right.pop());
        }
    }

}
