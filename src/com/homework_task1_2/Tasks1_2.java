package com.homework_task1_2;

public class Tasks1_2 {

    public static void print(int size) {
        int[][] multipleTable = new int[size][size];
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                int result = i * j;
                multipleTable[i - 1][j - 1] = result;
                System.out.printf("%d * %d = %d%n", i, j, result);
            }
            System.out.println();
        }
    }

    public static void copyArray(int[] array) {
        int[] copy = new int[array.length];
        for(int i = 0; i < copy.length; i++) {
            copy[i] = array[i];
            System.out.print(copy[i] + " ");
        }
    }

    public static void main(String[] args) {
        /*Task1 Write a program which creates two dimensional
        array and stores a multiplication table (from 1 - 10) in it.*/
        int size = 10;
        System.out.println("Multiplication Table:");
        print(size);

        /*Task2 Declare and initialize an array with four arbitrary whole numbers.
        Write a Java program to copy this array by iterating it.*/
        System.out.println("Copy of array:");
        int[] array = {4848, 23, 44, 66};
        copyArray(array);
    }
}
