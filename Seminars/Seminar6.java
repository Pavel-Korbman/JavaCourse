package Seminars;
// МНОЖЕСТВО КОЛЛЕКЦИЙ SET



import java.util.*;


public class Seminar6 {


    public static void main(String[] args) {

//        task0();
//        Integer[] array = createArr(1000, 0, 24);
//        //System.out.println(Arrays.toString(array));
//        System.out.println(task1(array));

        /* Задание №2
    1. Продумайте структуру класса Кот.
    Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, не обязательно реализовывать в java.
    2. Реализуйте 1 из вариантов класса Cat, можно использовать не все придуманные поля и методы.
    Создайте несколько экземпляров этого класса, выведите их в консоль.
    3. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
    выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
    4. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
    Поместите в него некоторое количество объектов.
    5. Создайте 2 или более котов с одинаковыми параметрами в полях.
    Поместите их во множество. Убедитесь, что все они сохранились во множество.
    4. Создайте метод public boolean equals(Object o)
    Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
    То есть, метод должен возвращать true,
    только если значения во всех полях сравниваемых объектов равны.
    5. Создайте метод public int hashCode() который будет возвращать hash,
    вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
    6. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.*/

        Cat cat1 = new Cat("Тильда", "Ж","Сиамская", "Павел", 2023);
        Cat cat2 = new Cat("Барсик", "М","Б.П.", "Архип", 2010);
        Cat cat3 = new Cat("Мурзик", "Ж","Б.П.", "Ярослав", 2023);
        Cat cat4 = new Cat("Нюша", "М","Бомбейская", "Лена", 2010);
        Cat cat5 = new Cat("Блюща", "Ж","Мейн Кун", "Володя", 2020);
        Cat cat6 = new Cat("Маня", "М","Тайская", "Александр", 2000);
        Cat cat7 = new Cat("Тильда", "Ж","Сиамская", "Павел", 2023);
        System.out.println(cat1.equals(cat7));  // Стали равны после прописания медода .equals в классе Cat
        System.out.println(cat1.hashCode());  // Стал 748790407 после прописания медода .hashCode в классе Cat
        System.out.println(cat7.hashCode());  // Стал тоже 748790407

        Set<Cat> Cats = new HashSet<>();
        Cats.add(cat1);
        Cats.add(cat2);
        Cats.add(cat3);
        Cats.add(cat4);
        Cats.add(cat5);
        Cats.add(cat6);
        Cats.add(cat7);

        for (Cat item : Cats){
            System.out.println(item); // Дубль (cat7) - отсеялся
        }

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
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(min, max + 1);
        }
        return arr;
    }

    static Double task1(Integer[] arr) {
        var set = new HashSet<>(Arrays.asList(arr));
        return (double) (set.size() * 100.0 / arr.length);
    }

}










