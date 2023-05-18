package org.exampl;

import java.util.Arrays;

public class Task2 {
    private static int maxIndex = 0;
    private static int minIndex = 0;

    public static int minIndex(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int maxIndex(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int[] reverseItems(int[] array) {
        if (array.length <= 1) return array;
        int temp;
        minIndex = minIndex(array);
        maxIndex = maxIndex(array);

        if (maxIndex < minIndex) return array;
        int firstElement = minIndex;
        int lastElement = maxIndex;

        while (firstElement <= lastElement) {
            temp = array[lastElement];
            array[lastElement] = array[firstElement];
            array[firstElement] = temp;
            firstElement++;
            lastElement--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arrayExample = {2, 3, 1, 2, 3, 4, 13, 3};
        System.out.println(Arrays.toString(Task2.reverseItems(arrayExample)));
    }
}
