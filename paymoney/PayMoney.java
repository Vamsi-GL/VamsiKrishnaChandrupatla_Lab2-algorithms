package com.greatlearning.paymoney;

public class PayMoney {
    //to check number of days required to achieve target amount
    public int numberOfDays(int[] transactions, int targetAmount){
        for(int i=0;i<transactions.length;i++){
            if (transactions[i] == targetAmount || transactions[i] > targetAmount){
                return i+1;
            }
            else{
                targetAmount = targetAmount - transactions[i];
            }
        }
        return -1;
    }

    //To print transactions
    public static void displayTransactions(int[] transactions){
        for(int transaction: transactions){
            System.out.print(transaction + " ");
        }
        System.out.println();
    }
}
