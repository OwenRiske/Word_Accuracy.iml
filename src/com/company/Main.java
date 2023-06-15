package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        System.out.print("First input: ");
        String input1=INPUT.nextLine();
        System.out.print("\nSecond input: ");
        String input2=INPUT.nextLine();
        System.out.println(wordAccuracy.word_accuracy(input1,input2));
    }
    }
