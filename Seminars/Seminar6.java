package Seminars;
// МНОЖЕСТВО КОЛЛЕКЦИЙ SET

import java.lang.reflect.Array;
import java.util.*;


public class Seminar6 {


    public static void main(String[] args) {

//        task0();

        Integer[] array = createArr(1000, 0, 24);
        //System.out.println(Arrays.toString(array));
        System.out.println(task1(array));
    }


    /* Задание №0
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
        */
    static void task0() {
        Integer[] arr = {2, 9, 3, 8, 1, 2, 3, 8};
        String[] str = {"abvfffff", "bvm", "mvff", "avaaak"};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        // set1 = new HashSet<>(Arrays.asList(arr));

        System.out.println(set1);  // [1, 2, 3, 8, 9] хэш функция для целых чисел по умолчанию сортирует по возрастанию
        System.out.println(set2);  // [2, 9, 3, 8, 1] сортирует по порядку добавления
        System.out.println(set3);  // [1, 2, 3, 8, 9] сортирует по возрастанию

        Set<String> set4 = new HashSet<>(Arrays.asList(str));
        Set<String> set5 = new LinkedHashSet<>(Arrays.asList(str));
        Set<String> set6 = new TreeSet<>(Arrays.asList(str));
        // set1 = new HashSet<>(Arrays.asList(arr));

        System.out.println(set4);  // [bvm, mvff, abvfffff, avaaak] хэш функция не сортирует по умолчанию текст
        System.out.println(set5);  // [abvfffff, bvm, mvff, avaaak] сортирует по порядку добавления
        System.out.println(set6);  // [abvfffff, avaaak, bvm, mvff] сортирует по алфавиту


    }

    /* Задание №1
  1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
  2. Создайте метод, в который передайте заполненный выше массив
  и с помощью Set вычислите процент уникальных значений в данном массиве
  и верните его в виде числа с плавающей запятой.
  Для вычисления процента используйте формулу:
  процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
          */
    static Integer[] createArr(int n, int min, int max) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i <n; i++) {
            arr[i] = new Random().nextInt(min, max + 1);
        }
        return arr;
    }

    static Double task1(Integer[] arr) {
        var set = new HashSet<>(Arrays.asList(arr));
        return (double) (set.size() * 100.0 / arr.length);
    }



    /* Задание №2*/

}










