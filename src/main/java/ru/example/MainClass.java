package ru.example;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        System.out.println(addMethod1((byte) 15, (short) 55)); // с интами не компилируется

        System.out.println(mulMethod1(10,20));

        System.out.println(getMaxNumber1(8, 8));
        System.out.println(getMaxNumber2(76, 76));

        System.out.println(isCharA('D'));

        System.out.println(isCharNumber('i'));

        binaryViewMethod();

        binaryMaxValue();

        System.out.println(charToInt('+'));

        System.out.println(intToChar(43));

    }

    public static byte addMethod1(byte a, short b)
    {
        // Метод принимающий 2 параметра: первый типа byte и второй типа short.
        // Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte.

        return (byte) (a + b);
    }

    public static int mulMethod1(int a, long b)
    {
        // Метод, принимающий 2 параметра: первый типа int и второй типа long.
        // Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int.

        return (int) (a * b);
    }

    public static int getMaxNumber1(int a, int b)
    {
        // Метод, принимающий 2 параметра: int и int.
        // Метод должен сравнить переданные параметры между собой и вернуть максимальный.

        if(a > b)
            return a;
        else if (b > a)
            return b;
        else
            return a;
    }

    public static int getMaxNumber2(int a, int b)
    {
        // Улучшенная версия метода getMaxNumber1

        return Math.max(a, b);
    }

    public static boolean isCharA(char c)
    {
        // Метод, принимающий 1 параметр типа char. Если передана буква 'А',
        // то возвращать true, а в остальных случаях false

        switch (c)
        {
            case 'A':
                return true;
            default:
                return false;
        }
//        return c == 'A';  // всё гениальное - просто!
    }

    public static boolean isCharNumber(char c)
    {
        // Метод, принимающий 1 параметр типа char.
        // Если передано число, то вернуть true, а в остальных случаях false

        return Character.isDigit(c);
    }

    public static void binaryViewMethod()
    {
        // Метод выводящий на экран в цикле бинарное представление чисел от 0 до 30.
        // Для вывода бинарного представления использовать Integer.toBinaryString().

        for(int i = 0; i <= 30; i++)
            System.out.print(Integer.toBinaryString(i) + "\t");

        System.out.println();
    }

    public static void binaryMaxValue()
    {
        // Метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1.

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public static int charToInt(char c)
    {
        // Метод принимающий 1 параметр типа char и возвращающий его числовое представление.

        return (int) c;
    }

    public static char intToChar(int i)
    {
        // Метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа.

        return (char) i;
    }

}
