package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count ");
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);

        while (num > 2){
            int sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
            num--;
        }
    }
}