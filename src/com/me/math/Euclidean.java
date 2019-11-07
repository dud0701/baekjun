package com.me.math;


/**
최대공약수 (GCD)
        시간 복잡도 :n
        -> 유클리드 호제법 이용하면 빠르게 구할 수 있다.

        두 수의 최대공약수는 두수의 나머지로 나누어 주면 된다.
        1. 재귀 함수 구현 가능
        2. 재귀 함수 사용하지 않고 구현

 */

public class Euclidean {
    public static void main(String[] args) {
        int recursion = gcdRecursion(24,12);
        System.out.println(recursion);

        int normal = gcdNormal(24, 12);
        System.out.println(normal);
    }

    //재귀 사용
    public static int gcdRecursion(int a, int b){
        if(b == 0){
            return a;
        }
        return gcdRecursion(b,a % b);
    }
    //재귀 사용 X
    public static int gcdNormal(int a, int b){
        while( b!= 0 ){
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }


}
