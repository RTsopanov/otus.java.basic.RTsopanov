package hw1;

import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
//1
        greetings();
//2
        checkSign(10, 5, -30);
//3
        selectColor();
//4
        compareNumbers();
//5
        addOrSubtractAndPrint(7, 7, false);
//6
        numMetod();
    }


    //1
    public static void greetings() {
        System.out.println("Hello\nWord\nfrom\nJava");
    }

    //2   Возможно if  указать в методе checkSign, а не в main ???
    public static void checkSign(int a, int b, int c) {
        int sumres = a + b + c;
        if (sumres >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //3
    public static void selectColor() {
        int data = 21;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //4
    public static void compareNumbers() {
        int a = 10;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println(a < b);
        }
    }

    //5   Почему Java во втором задании не пустила указать условие при объявлении метода,
    // а в задании 5 пустила указать условие ???
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    // 6
    public static void numMetod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 5: ");
        int metod = scanner.nextInt();
        if (metod == 1) {
            greetings();
        } else if (metod == 2) {
            checkSign(10, 5, -30);

        } else if (metod == 3) {
            selectColor();
        } else if (metod == 4) {
            compareNumbers();
        } else if (metod == 5) {
            addOrSubtractAndPrint(7, 7, false);
        } else {
            System.out.println("Значение не входит в диапозон 1-5");
        }
    }
}
