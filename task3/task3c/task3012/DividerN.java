package com.EPAMjavaWEB.task3.task3c.task3012;

//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

public class DividerN {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 100);
        System.out.println("Дано натуральное число " + n);
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 1 / i;
        }
        System.out.printf("Результат выражения 1 + 1/2 + 1/3 + 1/4 + ... + 1/n равен %5.3f\n", sum);
    }
}
