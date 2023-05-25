package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MAX_SIZE = 20;
    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the matrix (not more than 20): ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the matrix (not more than 20): ");
        int height = scanner.nextInt();

        if (width > MAX_SIZE || height > MAX_SIZE) {
            System.out.println("Matrix dimensions exceed the maximum size.");
            return;
        }

        int[][] matrix;
        System.out.print("Enter 'M' for manual input or 'R' for random input: ");
        String inputChoice = scanner.next();

        if (inputChoice.equalsIgnoreCase("M")) {
            matrix = readMatrixManually(scanner, width, height);
        } else if (inputChoice.equalsIgnoreCase("R")) {
            matrix = generateRandomMatrix(width, height);
        } else {
            System.out.println("Invalid input choice.");
            return;
        }

        System.out.println("Matrix:");
        printMatrix(matrix);

        int minValue = findMinimumValue(matrix);
        int maxValue = findMaximumValue(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Average: " + average);
    }

    private static int[][] readMatrixManually(Scanner scanner, int width, int height) {
        int[][] matrix = new int[height][width];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] generateRandomMatrix(int width, int height) {
        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            }
        }

        return matrix;
    }

    private static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int findMinimumValue(int[][] matrix) {
        int minValue = Integer.MAX_VALUE;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element < minValue) {
                    minValue = element;
                }
            }
        }

        return minValue;
    }

    private static int findMaximumValue(int[][] matrix) {
        int maxValue = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > maxValue) {
                    maxValue = element;
                }
            }
        }

        return maxValue;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0.0;
        }
    }
}