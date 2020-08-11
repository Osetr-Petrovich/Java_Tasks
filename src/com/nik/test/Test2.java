package com.nik.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        double[] massive = new double[n];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = Math.random();
        }
        System.out.println("Массив из " + n + " элемента(ов):" + Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length - 1; j++) {
                if (massive[j] > massive[j + 1]) {
                    double buf = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = buf;
                }
            }
        }
        System.out.println("отсортированный массив:" + Arrays.toString(massive));
    }
}