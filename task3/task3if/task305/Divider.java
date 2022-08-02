package com.EPAMjavaWEB.task3.task3if.task305;

//Определить, делителем каких чисел а, b, с является число k.

public class Divider {
    public static void main(String[] args) {
        int a = 25, b = 40, c = 14;
        int div = 5;
        System.out.printf("Заданы три числа a = %d, b = %d, c = %d\n", a, b, c);
        if ((a % div) == 0) {
            System.out.printf("k = %d делитель a = %d\n", div, a);
        }
        if ((b % div) == 0) {
            System.out.printf("k = %d делитель b = %d\n", div, b);
        }
        if ((c % div) == 0) {
            System.out.printf("k = %d делитель c = %d\n", div, c);
        }
        if (((a % div) != 0) & ((b % div) != 0) & ((c % div) != 0)) {
            System.out.println("k не является делителем заданных чисел");
        }
    }
}
