package com.EPAMjavaWEB.task3.task3c.task3011;

//Найти сумму квадратов первых ста чисел

public class SumSquare {
    public static void main(String[] args) {
        int x = 100;
        int sumSq = 0;
        for (int i = 1; i <= x; i++) {
            sumSq += i * i;
        }
        System.out.println("Сумма квадратов первых ста чисел равна " + sumSq);
    }
}
