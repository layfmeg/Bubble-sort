package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] fisrtArray = new int[7]; /// Рандом числа
        int[] secondArray = new int[7]; /// Числа введёные юзером
        int matchCount = 0;

        for (int i = 0; i < fisrtArray.length; i++) {
            fisrtArray[i] = random.nextInt(10);
        }
        System.out.println("Введите 7 чисел от 0 до 9 через пробел:");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = scanner.nextInt();
        }
        scanner.close();

        /// Bubble sort первого массива
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < fisrtArray.length; i++) {
                if (fisrtArray[i] < fisrtArray[i - 1]) {
                    int temp = fisrtArray[i];
                    fisrtArray[i] = fisrtArray[i - 1];
                    fisrtArray[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        /// Bubble sort второго массива
        boolean isSorted1 = false;
        while (!isSorted1) {
            isSorted1 = true;
            for (int i = 1; i < secondArray.length; i++) {
                if (secondArray[i] < secondArray[i - 1]) {
                    int temp = secondArray[i];
                    secondArray[i] = secondArray[i - 1];
                    secondArray[i - 1] = temp;
                    isSorted1 = false;
                }
            }
        }

        for (int i = 0; i < fisrtArray.length; i++) {
            if (fisrtArray[i] == secondArray[i]) {
                matchCount++;
            }
        }
        System.out.println("Количество совпадений: " + matchCount);
        System.out.println("Другий массив" + Arrays.toString(secondArray));
        System.out.println("Перший массив" + Arrays.toString(fisrtArray));
    }
}