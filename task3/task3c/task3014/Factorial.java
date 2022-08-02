package com.EPAMjavaWEB.task3.task3c.task3014;

//Требуется определить факториал числа, которое ввел пользователь

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long sumF = 1L;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число не более 20: ");
        if (!sc.hasNextInt()) {
            System.out.println("Не число");
            return;
        }
        int x = sc.nextInt();
        if ((x / 21) == 0) {
            for (int i = 1; i <= x; i++) {
                sumF *= i;
            }
            System.out.println("Факториал числа " + x + "! = " + sumF);
        } else {
            System.out.println("Введённое число больше 20 и результат выходит за диапазон Long.MAX_VALUE");
        }
    }
}
