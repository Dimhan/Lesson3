package com.EPAMjavaWEB.task3.task3if.task304;

//Вычислить значение функции: F(x) = (-x*x +3*x + 9 {x >= 3}) | (1/(x*x*x - 6) {x < 3})

public class FunctionFx {
    public static void main(String[] args) {
        double fx;
        double x = Math.random() * 10;
        System.out.println("The function is set F(x) = (-x * x + 3 *  x + 9 {x >= 3}) | (1/(x * x * x - 6) {x < 3})");
        if (x >= 3) {
            fx = -x * x + 3 * x + 9;
            System.out.printf("Function value in range x >= 3 is F(%5.3f) = %5.3f\n", x, fx);
        } else {
            fx = 1 / (x * x * x - 6);
            System.out.printf("Function value in range x < 3 is F(%5.3f) = %5.3f\n", x, fx);
        }
    }
}
