package ru.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DZ1();

    }

    private static void DZ1() {
        System.out.println("Hello friends!");                                                   //Задача 3/
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа в диапозоне [-64;64]: ");
        byte q = in.nextByte();
        byte w = in.nextByte();
        System.out.println("2 числа: " + q + ", " + w);
        System.out.println("Сумма этих чисел = " + summa(q, w));                                 //Задача 4
        System.out.println("Произведение этих чисел = " + proizvedenie(q, w));                   //Задача 5
        System.out.println("Максимальное число = " + getMaxNumber(q, w));                        //Задача 6
        System.out.println("Введите символ 'A' ");
        char e = in.next().charAt(0);
        System.out.println((isCharA(e)) ? "Ура!!! Введена буква А" : "Увы, тебе не удалось");   //Задача 7
        System.out.println("Введите любую цифру");
        char r = in.next().charAt(0);
        System.out.println(isCharNumber(r) ? ("Вы ввели цифру " + r) : "Вы ввели не цифру");    //Задача 8
        isBinAt0To30CharNumber();                                                               //Задача 9
        PrintMAX_VALUE();                                                                       //Задача 10
        System.out.println("Введите любой символ");
        char s = in.next().charAt(0);
        System.out.println("Числовой код вашего символа = " + CharInNumb(s));                   //Задача 11
        System.out.println("Введите числовой код символа");
        int t = in.nextInt();
        System.out.println("Это символ - " + NumbInChar(t));                                    //Задача 12
        //System.exit(2);
    }

    //Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа
    private static char NumbInChar(int a7) {
        return (char) a7;
    }

    //Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.
    private static int CharInNumb(char a6) {
        return a6;
    }

    //Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1. Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего. Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти
    private static void PrintMAX_VALUE() {
        int max1 = Integer.MAX_VALUE;
        //long max2 = max1 + 1;
        System.out.println("Максимальное число типа Integer = " + max1 + " (dec) = " + Integer.toBinaryString(max1) + " (bin)");
        System.out.println("Максимальное число типа Integer + 1 = " + (max1 + 1) + " (dec) = " + Integer.toBinaryString(max1 + 1) + " (bin)");
    }

    //Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30. Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.
    private static void isBinAt0To30CharNumber() {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + " = " + Integer.toBinaryString(i) + " ; ");
        }
        System.out.println();
    }

    //Написать метод isCharNumber принимающий 1 параметр типа char. Если передано число, то вернуть true, а в остальных случаях false
    private static boolean isCharNumber(char a5) {
        return Character.isDigit(a5);
    }

    //Написать метод isCharA принимающий 1 параметр типа char. Если передана буква 'А', то возвращать true, а в остальных случаях false
    private static boolean isCharA(char a4) {
        return (a4 == 'A') || ((a4 == 'А'));
    }

    //Написать метод getMaxNumber принимающий 2 параметра: int и int. Метод должен сравнить переданные параметры между собой и вернуть максимальный. Для решения необходимо использовать IF или тернарный оператор ?:
    private static int getMaxNumber(int a3, int b3) {
        //if (a3<b3) return b3; else return a3;//С помощью  IF
        //return (a3 >= b3) ? a3 : b3; //С помощью тернарного оператора
        return Math.max(a3, b3);// С помощью библеотеки Math

    }

    //Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short. Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte.
    private static byte summa(byte a1, short b1) {
        return (byte) (a1 + b1);
    }

    //Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long. Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int.
    private static int proizvedenie(int a2, long b2) {
        return (int) (a2 * b2);
    }

}
