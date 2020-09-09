package com.company.z7;

import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i > 0) {
            int fact = 1;
            for (int j = 1; j < i + 1; j++) {
                fact *= j;
            }
            System.out.println(fact);
        }
        else {
            System.out.println("Not correct number");
        }
    }
}