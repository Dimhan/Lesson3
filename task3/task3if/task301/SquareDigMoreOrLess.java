package com.EPAMjavaWEB.task3.task3if.task301;

//Составить программу нахождения наименьшего из квадратов двух чисел а и b

public class SquareDigMoreOrLess {
    public static void main(String[] args) {
        int a = 155, b = 33;
        if ((a * a) > (b * b)) {
            System.out.printf("Квадрат числа a = %d больше квадрата числа b = %d\n", a, b);
            System.out.printf("                %d           БОЛЬШЕ       %d", a * a, b * b);
        } else {
            System.out.printf("Квадрат числа b = %d больше квадрата числа a = %d\n", b, a);
            System.out.printf("                %d           БОЛЬШЕ        %d", b * b, a * a);
        }
    }
}
