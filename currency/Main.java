package com.greatlearning.currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of denominations:");
        int numberOfDenominations = sc.nextInt();

        int[] denominations = new int[numberOfDenominations];

        System.out.println("Enter the currency Denominations:");
        for(int i=0;i<denominations.length;i++){
            denominations[i] = sc.nextInt();
        }

        System.out.println("Enter the amount which you want to pay:");
        int amount = sc.nextInt();

        //To print denominations
        for(int denomination: denominations){
            System.out.print(denomination + " ");
        }
        System.out.println();

        Currency currency = new Currency(denominations,numberOfDenominations);
        MergeSort.sort(currency.denominations, 0, numberOfDenominations-1);

        //To print denominations in sorted order
        for(int denomination: denominations){
            System.out.print(denomination + " ");
        }
        System.out.println();

        NotesCount.numberOfDenomination(currency.denominations,amount);
    }
}
