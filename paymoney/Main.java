package com.greatlearning.paymoney;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the transactions array i.e Number of days you want to track");
        int size = sc.nextInt();
        int[] transactions = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter daily transactions in Crores: " + (i+1));
            transactions[i] = sc.nextInt();
        }
        System.out.println("Enter the target amount in Crores which you want to achieve");
        int target = sc.nextInt();
        PayMoney pm = new PayMoney();
        int numberOfDays = pm.numberOfDays(transactions,target);
        if(numberOfDays == -1 ){
            System.out.println("The target " + target +" not achieved.");
        }
        else{
            System.out.println("The target " + target + " crores is achieved in " + numberOfDays + " days");
        }
        sc.close();
    }
}