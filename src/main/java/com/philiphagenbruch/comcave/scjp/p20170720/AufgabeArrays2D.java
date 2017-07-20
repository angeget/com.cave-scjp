package com.philiphagenbruch.comcave.scjp.p20170720;

public class AufgabeArrays2D {

    public static char[][] createAndPrintBorderedArray(final int size, final char borderChar) {
        final char[][] r = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(i == 0 || i == size - 1 || j == 0 || j == size - 1 ? borderChar : ' ');
            }
            System.out.println();
        }

        return r;
    }

    public static int[][] createArray(final int width, final int height) {
        return new int[width][height];
    }

    public static int[][] createArray(final int width, final int height, final int defaultValue) {
        if (defaultValue == 0) return createArray(width, height);

        final int[][] r = new int[width][height];
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                r[i][j] = defaultValue;
            }
        }
        return r;
    }

    public static void main(final String[] args) {
        int[][] arr = createArray(5, 5);

        printArray(arr);

        arr[1][1] = 5;
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 2;
            }
        }

        arr = createArray(5, 5, 3);
        printArrayCommaSeparated(arr);

        createAndPrintBorderedArray(7, 'o');

    }

    public static void printArray(final int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printArrayCommaSeparated(final int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
