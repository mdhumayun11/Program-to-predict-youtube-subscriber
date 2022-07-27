package com.bot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter current no.of subs:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter rate of growth:");
        double r = scan.nextDouble();
        System.out.println("Time interval");
        int x = scan.nextInt();
        System.out.println("Expected subs after time duration:");
        System.out.println(calculateSubs(a, r, x));
    }
    public static int calculateSubs(int a,double r,int x) {
        return   (int) (a * Math.pow((1 + r), x));
    }
}
