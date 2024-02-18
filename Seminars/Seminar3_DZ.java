package Seminars;
// КОЛЛЕКЦИИ


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.*;
import java.util.stream.IntStream;

public class Seminar3_DZ {

    public static void main(String[] args) {
//        int[] a = new int[]{5, 1, 6, 2, 3, 4};
//        System.out.println(Arrays.toString(mergeSort(a)));
        Integer[] arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
//        removeEvenNumbers(arr);
        analyzeNumbers(arr);
//        System.out.println(removeEvenNumbers(arr));

    }

    /* Задание №1
       Внутри класса MergeSort напишите метод mergeSort,
       который принимает массив целых чисел, реализует алгоритм сортировки слиянием.
       Метод должен возвращать отсортированный массив.

Пример
a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
        */
//    public static int[] mergeSort(int[] a) {
//        return sort(a, a.length);
//    }
//
//    public static int[] sort(int[] a, int n) {
//        if (n < 2) return a;
//        int mid = n / 2;
//        int[] l = new int[mid];
//        int[] r = new int[n - mid];
//
//        for (int i = 0; i < mid; i++) {
//            l[i] = a[i];
//        }
//        for (int i = mid; i < n; i++) {
//            r[i - mid] = a[i];
//        }
//        sort(l, mid);
//        sort(r, n - mid);
//
//        merge(a, l, r, mid, n - mid);
//        return a;
//    }
//
//
//    public static void merge(
//            int[] a, int[] l, int[] r, int left, int right) {
//
//        int i = 0, j = 0, k = 0;
//        while (i < left && j < right) {
//            if (l[i] <= r[j]) {
//                a[k++] = l[i++];
//            } else {
//                a[k++] = r[j++];
//            }
//        }
//        while (i < left) {
//            a[k++] = l[i++];
//        }
//        while (j < right) {
//            a[k++] = r[j++];
//        }
//    }

    /* Задание №2
      Дан произвольный массив целых чисел.
      Создайте список ArrayList, заполненный данными из этого массива.
      Необходимо удалить из списка четные числа и вернуть результирующий.
      Напишите свой код в методе removeEvenNumbers класса Answer.
      Метод removeEvenNumbers принимает на вход один параметр:
      Integer[] arr - список целых чисел,
      возвращает список ArrayList<Integer>

Примеры.
Исходный массив: 1, 2, 3, 4, 5, 6, 7, 8, 9
Результат: [1, 3, 5, 7, 9]

Исходный массив: 2, 4, 6, 8
Результат: []
        */
    public static void removeEvenNumbers(Integer[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int item : arr) {
            if (item %2 != 0) list.add(item);
        }
        System.out.println(list);

    }

    public static void analyzeNumbers(Integer[] arr) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
        double av = list.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);

        System.out.println(list);
        System.out.println("Minimum is " + Collections.min(list));
        System.out.println("Maximum is " + Collections.max(list));
        System.out.println("Average is = " + av);
    }

}