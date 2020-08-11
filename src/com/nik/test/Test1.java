package com.nik.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        double[] massive = new double[n];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = Math.random();
        }
        System.out.println("Массив из " + n + " элемента(ов):" + Arrays.toString(massive));
        double maximum = massive[0];
        double minimum = massive[0];
        double midle = 0;
        for (int i = 0; i < massive.length; i++) {
            if(maximum < massive[i])
                maximum = massive[i];
            if(minimum > massive[i])
                minimum = massive[i];
            midle += massive[i]/massive.length;
        }
        System.out.println("максимальный элемент массива = " + maximum);
        System.out.println("минимальный элемент массива = " + minimum);
        System.out.println("среднее значение элементов = " + midle);
    }
}
