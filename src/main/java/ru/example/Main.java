package ru.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

    private static char NumbInChar(int a7) {
        return (char) a7;
    }

    private static int CharInNumb(char a6) {
        return a6;
    }

    private static void PrintMAX_VALUE() {
        int max1 = Integer.MAX_VALUE;
        //long max2 = max1 + 1;
        System.out.println("Максимальное число типа Integer = " + max1 + " (dec) = " + Integer.toBinaryString(max1) + " (bin)");
        System.out.println("Максимальное число типа Integer + 1 = " + (max1 + 1) + " (dec) = " + Integer.toBinaryString(max1 + 1) + " (bin)");
    }

    private static void isBinAt0To30CharNumber() {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + " = " + Integer.toBinaryString(i) + " ; ");
        }
        System.out.println();
    }

    private static boolean isCharNumber(char a5) {
        return Character.isDigit(a5);
    }

    private static boolean isCharA(char a4) {
        return (a4 == 'A') || ((a4 == 'А'));
    }

    private static int getMaxNumber(int a3, int b3) {
        //if (a3<b3) return b3; else return a3;//С помощью  IF
        //return (a3 >= b3) ? a3 : b3; //С помощью тернарного оператора
        return Math.max(a3, b3);// С помощью библеотеки Math

    }

    private static byte summa(byte a1, short b1) {
        return (byte) (a1 + b1);
    }

    private static int proizvedenie(int a2, long b2) {
        return (int) (a2 * b2);
    }

}
