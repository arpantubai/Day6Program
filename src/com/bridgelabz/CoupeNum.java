package com.bridgelabz;


import java.util.Random;
import java.util.Scanner;

public class CoupeNum {
    public static void main(String[] args) {
        System.out.print("Please Enter n to generate random  numbers for Coupon number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(100000);
            int j = i - 1;
            while (j >= 0) {
                if (arr[i] == arr[j]) {
                    i--;
                    j = -1;
                }
                j--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("Unique Generated coupon numbers is : ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
