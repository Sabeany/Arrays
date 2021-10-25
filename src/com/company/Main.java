package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 6, 2, 8};
        forLoop(array);
        forEachLoop(array);
        whileLoop(array);
        doWhile(array);
    }

    static void forLoop(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
        }
    }

    static void forEachLoop(int[] array) {
        for (int i : array)
            System.out.println(i);
    }

    static void whileLoop(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    static void doWhile(int[] array) {
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        }
        while (i < array.length);
    }
}
