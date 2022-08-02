package com.EPAMjavaWEB.task3.task3c.task3013;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
//равен заданному е. Общий член ряда имеет вид: An=1/((3n-2)(3n+1))

public class DigSeries {
    public static void main(String[] args) {
        double sum = 0;
        double genMemOfSer;
        double e = Math.random() - Math.random();
        System.out.printf("Задано некоторое число е = %5.3f ", e);
        int n = (int) (Math.random() * 10000);
        System.out.println("Общий член числового ряда An=1/((3n-2)(3n+1)), где n = " + n);
        for (int i = 0; i <= n; i++) {
            genMemOfSer = (3 * i - 2) * (3 * i + 1);
            genMemOfSer = 1 / genMemOfSer;
            if (Math.abs(genMemOfSer) >= e) {
                sum += genMemOfSer;
            }
        }
        System.out.printf("Сумма членов ряда, модуль которых больше или " +
                "равен е = %5.3f  Sne = %5.3f", e, sum);
    }
}
