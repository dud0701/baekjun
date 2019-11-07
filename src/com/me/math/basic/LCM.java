package com.me.math.basic;

/**
 *  최소 공배수
 *  두 수의 최대공약수로 구할 수 있다.
 *
 *  GCD(a,b)
 *  a* b = gcd * LCM
 *  LCM = a*b / gcd
 */
public class LCM {
    public static void main(String[] args) {
        int result = getLCM(32, 2);
        System.out.println(result);
    }

    public static int getLCM(int a, int b){
        return a*b / gcd(a,b);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

}
