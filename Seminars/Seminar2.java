// Задачки на методы

//import java.time.LocalTime;
//import java.util.Arrays;
//import java.util.Scanner;


import java.util.Arrays;

public class Seminar2 {

    public static void main(String[] args) {

//        System.out.println(Task0(10, 'L', 'a'));
//        System.out.println(Task1("caaaabbbaacdd"));
        System.out.println(Task3("Ab1Ba"));

    }

    /* МОИ МЕТОДЫ*/

/*   Задание №1
    Дано четное число N (>0) и символы c1 и c2.
    Написать метод, который вернет строку длины N,
    которая состоит из чередующихся символов c1 и c2, начиная с c1. */

//    static String Task0(int n, char c1, char c2) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < n / 2; i++) {
//            stringBuilder.append(c1).append(c2);
//        }
//        return stringBuilder.toString();
//    }

 /*       Задание №2
    Напишите метод, который сжимает строку.
    Пример: вход caaaabbbaacdd. выход a6b3c2d2 */
//    static String Task1(String str) {
//        StringBuilder stringBuilder = new StringBuilder();
//        char[] arr = str.toCharArray();
//        Arrays.sort(arr);
//        int count = 1;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == arr[i - 1]) count++;
//            else {
//                stringBuilder.append(arr[i-1]).append(count);
//                count = 1;
//                }
//        }
//        stringBuilder.append(arr[arr.length-1]).append(count);
//        return stringBuilder.toString();
//    }

    /* Задание №3
    Напишите метод, который принимает на вход строку (String)
    и определяет является ли строка палиндромом (возвращает boolean значение).
     */
    static boolean Task3(String str) {
        str = str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        if (stringBuilder.reverse().toString().equals(str)) return true; // equals() сравнивает строки
        else return false;
    }


}
