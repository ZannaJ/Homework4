package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> fibonacci = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the position you want from 1 till 20:");

        int number = scanner.nextInt();
        int n1=1, n2=1, n3, i, count=20;
        fibonacci.add(n1);
        fibonacci.add(n2);
        System.out.print(n1 + " " + n2);

        for(i=2; i<count; ++i) {

            n3 = n1 + n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
            fibonacci.add(n3);
        }
        System.out.println();
        System.out.println("The fibonacci number of " + number + " is " + fibonacci.get(number - 1));
    }
}