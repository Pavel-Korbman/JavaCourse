import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;


public class Seminar1 {

    public static void main(String[] args) {
//        hello();
//        task2();
//        task3();
//        System.out.println(task5("Добро пожаловать на курс по Java"));
        System.out.println(task6(2, 3));

    }

    /* МОИ МЕТОДЫ*/

    // Печать массива
    static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    /* ЗАДАЧИ СЕМИНАРА:
     */

    /* ЗАДАЧА 1
    В консоли запросить имя пользователя.
    В зависимости от текущего времени, вывести приветствие вида
    "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
     */
    static void hello() {  // static позволяет не привязывать метод к классу и вызывать его в main напрямую
        System.out.println("Ваше имя: ");
        Scanner scanner = new Scanner(System.in); // Создаём объект класса Scanner для получения его методов и называем его scanner
        String str = scanner.nextLine();  // Присваиваем переменной str строку из терминала
        LocalTime localTime = LocalTime.now(); //Создаём объект с информацией о времени на компе класса LocalTime методом .now().
        int hours = localTime.getHour(); // Присваиваем переменной время в часах
        if (hours >= 5 && hours < 12) System.out.println("Доброе утро, " + str + "!");
        else if (hours < 18) System.out.println("Добрый день, " + str + "!");
        else if (hours < 23) System.out.println("Добрый вечер, " + str + "!");
        else System.out.println("Доброй ночи, " + str + "!");
    }


    /* ЗАДАЧА 2
    Дан массив двоичных чисел, например [1,1,0,1,1,1],
    вывести максимальное количество подряд идущих 1.
     */
    static void task2() {
        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count++;
            if (arr[i] == 0 || i == arr.length - 1) {  // Второе условие на случай если последняя значение в массиве не 0
                if (maxOnes < count) maxOnes = count;
                count = 0;
            }
        }
        System.out.println(maxOnes);

    }

    /* ЗАДАЧА 3
    Дан массив nums = [3,2,2,3] и число val = 3.
    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
    а остальные - равны ему.
     */
    static void task3() {
        int[] nums = {3, 2, 2, 3, 1, 2, 0};
        int val = 3;
        int[] tempArr = new int[nums.length];
        Arrays.fill(tempArr, val);  // В классе Arrays метод .fill() заполняет массив одним значением
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tempArr[count] = nums[i];
                count++;
            }

        }
//        printArr(tempArr);  // Моим методом
        System.out.println(Arrays.toString(tempArr));  // Печать массива строкою. Arrays.toString переделывает в строку


    }

     /* ЗАДАЧА 5
    Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
     */

    static String task5(String str) {
        String[] arr = str.split(" ");
        String res = "";
        for (String val : arr) {
            res = val + " " + res;
        }
        return res.toUpperCase();
    }

    /* ЗАДАЧА 6
    Реализовать функцию возведения числа а в степень b. a, b из Z.
    Сводя количество выполняемых действий к минимуму.
    Пример 1: а = 3, b = 2, ответ: 9
    Пример 2: а = 2, b = -2, ответ: 0.25
    Пример 3: а = 3, b = 0, ответ: 1
     */
    static Double task6(int a, int n) {
        Double res = 1.0;
        if (n == 0) return 1.0;
        for (int i = 0; i < Math.abs(n); i++) res *= a;
        if (n < 0) return 1.0 / res;
        return res;
    }


}
