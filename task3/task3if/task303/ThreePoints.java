package com.EPAMjavaWEB.task3.task3if.task303;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class ThreePoints {
    public static void main(String[] args) {

// Формула прямой, проходящуй через две точки
// (x - x1)/(x2 - x1) = (y - y1)/(y2 -y1) => (x -x1)*(y2 - y1) = (y - y1)*(x2 - x1)

        int x1 = 1, x2 = 1, x3 = 3;
        int y1 = 1, y2 = -1, y3 = 3;
            if (((x2 - x1) * (y3 - y1)) == ((y2 - y1) * (x3 - x1))) {
                System.out.printf("Заданные координаты (%d, %d), (%d, %d), (%d, %d) расположены на одной прямой\n",
                        x1, y1, x2, y2, x3, y3);
            } else {
                System.out.printf("Заданные координаты (%d, %d), (%d, %d), (%d, %d) не расположены на одной прямой\n",
                        x1, y1, x2, y2, x3, y3);
            }
    }
}
