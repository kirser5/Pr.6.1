package ru.mirea.pr6;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество ID: ");
        int n = in.nextInt();
        int[] iDNumber = new int[n];
        System.out.println("Введите ID");
        for(int i=0;i<n;i++) {
            iDNumber[i] = in.nextInt();
        }

        for (int left = 0; left < iDNumber.length; left++) {
            // Вытаскиваем значение элемента
            int value = iDNumber[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int j = left - 1;
            for (; j >= 0; j--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < iDNumber[j]) {
                    iDNumber[j + 1] = iDNumber[j];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            iDNumber[j + 1] = value;
        }
        System.out.println("Вывод ID в сортированном виде:");
        for (int k=0;k<n;k++){
            System.out.println(iDNumber[k]);
        }

    }
}