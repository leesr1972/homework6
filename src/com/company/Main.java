package com.company;

import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
	// write your code here
        int[] expensesPerDay = generateRandomArray();
        int monthlyExpenses = 0;
        for (int element: expensesPerDay) {
            monthlyExpenses += element;
        }
        System.out.println("Сумма расходов за месяц составила " + monthlyExpenses + ",00 рублей.");

        int minExpensesPerDay = expensesPerDay[0];
        int maxExpensesPerDay = expensesPerDay[0];
        for (int i = 1; i < expensesPerDay.length; i++) {
            if (expensesPerDay[i] < minExpensesPerDay) {
                minExpensesPerDay = expensesPerDay[i];
            }
            if (expensesPerDay[i] > maxExpensesPerDay) {
                maxExpensesPerDay = expensesPerDay[i];
            }
        }
        System.out.println("Минимальная сумма расходов за день составила " + minExpensesPerDay + ",00 рублей.");
        System.out.println("Максимальная сумма расходов за день составила " + maxExpensesPerDay + ",00 рублей.");

        float averageExpensesPerDay = monthlyExpenses / 30f;
        System.out.println("Средняя сумма расходов за день составила " + averageExpensesPerDay + " рублей.");

        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length - 1; j >=0; j--) {
            System.out.print(reverseFullName[j]);
        }
    }


}




