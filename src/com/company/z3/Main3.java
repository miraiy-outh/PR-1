package com.company.z3;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int summa = 0;
        int i = scan.nextInt();
        int[] massive = new int[i];
        for (int j = 0; j < massive.length; j++) {
            massive[j] = scan.nextInt();
            summa += massive[j];
        }
        System.out.println(summa);
    }
}