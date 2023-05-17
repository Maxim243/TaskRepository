package org.exampl;

import java.util.Arrays;

public class Task2 {

    public static int[] reverseItems(int[] array) {
        if (array.length <= 1) return array;
        int temp;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
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
        int[] arrayExample = {2, 3, 1, 4, 6, 5, 13, 3};
        System.out.println(Arrays.toString(Task2.reverseItems(arrayExample)));
    }
}
