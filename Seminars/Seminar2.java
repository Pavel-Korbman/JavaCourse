// Задачки на методы

//import java.time.LocalTime;
//import java.util.Arrays;
//import java.util.Scanner;



public class Seminar2 {

    public static void main(String[] args) {

        System.out.println(Task0(10, 'L', 'a'));

    }

    /* МОИ МЕТОДЫ*/

//    Задание №1
//    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N,
//    которая состоит из чередующихся символов c1 и c2, начиная с c1.

    static String Task0(int n, char c1, char c2 ){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            stringBuilder.append(c1).append(c2);
        }
        return stringBuilder.toString();
    }



}
