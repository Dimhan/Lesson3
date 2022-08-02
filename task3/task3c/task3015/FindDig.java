package com.EPAMjavaWEB.task3.task3c.task3015;

//В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7,
//то получили исходное число. Найти это число.

public class FindDig {
    public static void main(String[] args) {
        int xFind;
        int i = 15; // 14 * 7 ещё не трёхзначное  число
        do {
            xFind = i * 7;
            i++;
        } while ((i <= 99) & (xFind != ((xFind % 100) * 7)));
        if (i != 99) {
            System.out.println("Искомое число равно " + xFind);
        } else {
            System.out.println("Число не найдено");
        }
    }
}
