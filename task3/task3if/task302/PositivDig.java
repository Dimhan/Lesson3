package com.EPAMjavaWEB.task3.task3if.task302;

//Подсчитать количество положительных среди чисел а, b, с.

public class PositivDig {
    public static void main(String[] args) {
        int a = -34, b = 72, c = 157;
        int positivI = 0;
        if (a > 0) {
            positivI++;
        }
        if (b > 0) {
            positivI++;
        }
        if (c > 0) {
            positivI++;
        }
        System.out.printf("Количество положительных среди чисел а = %d, b = %d, с = %d равно %d", a, b, c, positivI);
    }
}
