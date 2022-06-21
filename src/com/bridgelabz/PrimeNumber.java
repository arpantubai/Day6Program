package com.bridgelabz;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 27;
        int flag=0;
        for (int i=2; i<(num/2); i++){

            if(num%i == 0){
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Prime number ");
        }else {
            System.out.println("Not a prime number ");
        }
    }
}