package com.company.z6;

import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = (int)(Math.random() * 20);
        int size1 = rand.nextInt(20)%20;
        int[] massive = new int[size];
        int[] massive1 = new int[size1];
        for (int j = 0; j < massive.length; j++){
            massive[j] = (int)(Math.random() * size);
            if (j != massive.length - 1) {

                System.out.print(massive[j] + " ");
            }
            else{
                System.out.print(massive[j]);
            }
        }
        Arrays.sort(massive);
        System.out.printf("%n");
        for (int j = 0; j < massive.length; j++){
            if (j != massive.length - 1) {
                System.out.print(massive[j] + " ");
            }
            else{
                System.out.print(massive[j]);
            }
        }
        System.out.printf("%n");
        for (int j = 0; j < massive1.length; j++){
            massive1[j] = rand.nextInt()%20;
            if (j != massive1.length - 1) {

                System.out.print(massive1[j] + " ");
            }
            else{
                System.out.print(massive1[j]);
            }
        }
        Arrays.sort(massive1);
        System.out.printf("%n");
        for (int j = 0; j < massive1.length; j++){
            if (j != massive1.length - 1) {
                System.out.print(massive1[j] + " ");
            }
            else{
                System.out.print(massive1[j]);
            }
        }

    }

}