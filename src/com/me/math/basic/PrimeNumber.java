package com.me.math.basic;

/**
 * 소수
 * 	1. n이 소수 인지 아닌지 ? ( 수 1개)
 */
public class PrimeNumber {
    public static void main(String[] args) {
        boolean result = isPrimeNumber(6);
        if (result) {
            System.out.println("소수");
        } else {
            System.out.println("소수 아님");
        }
    }

    public static boolean isPrimeNumber(int n){
        if(n < 2 ){
            return true;
        }

        for(int i=2;i<n-1;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
