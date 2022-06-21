package com.bridgelabz;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for checking ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum += i;
                System.out.println(i);
            }
        }
        if(sum == num){
            System.out.println("perfect number ");
        }else {
            System.out.println("Not a perfect number ");
        }
    }
}