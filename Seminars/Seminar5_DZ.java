package Seminars;

import java.util.*;

/* 1 Задача
Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:

add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.

find(String name): Поиск номеров телефона по имени в телефонной книге.
Если запись с именем name существует, возвращает список номеров телефона для этой записи.
Если запись с именем name не существует, возвращает пустой список.

getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.

Пример.

На входе:

add("Alice", 123456);
add("Alice", 789012);
add("Bob", 789012);

На выходе:
Команды:

find("Alice")
getPhoneBook()
find("Me")

Результат:
[123456, 789012].
{Bob=[789012], Alice=[123456, 789012]}
[]

 */

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();


    public void add(String name, int phoneNum) {
        ArrayList<Integer> phoneNumbs = new ArrayList<>();

// Введите свое решение ниже
        if (!phoneBook.containsKey(name)) {
            phoneNumbs.add(phoneNum);

        } else {
            phoneNumbs.addAll(phoneBook.get(name));
            phoneNumbs.add(phoneNum);

        }
        phoneBook.put(name, phoneNumbs);

    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) return phoneBook.get(name);
        return new ArrayList<>();
    }

    public static String getPhoneBook() {
// Введите свое решение ниже
        return phoneBook.toString();
    }
}

/* 2 Задача
Вы работаете с приложением для учета имен пользователей.
Ваша задача - разработать программу, которая принимает на вход пять имен пользователей
(или использует имена по умолчанию, если аргументы не предоставлены)
и подсчитывает, сколько раз каждое имя встречается.
Программа должна использовать HashMap для хранения имен и их количества вхождений.
По завершении, программа выводит результат в виде пар "имя - количество".
 */
class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        if (!names.containsKey(name)) names.put(name, 1);
        else {
            int count = names.get(name) + 1;
            names.put(name, count);
        }

    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        // Введите свое решение ниже
        System.out.println(names.toString());
    }
}

/* 3 Задача
Сортировка массива с использованием кучи

Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort).
Программа должна работать следующим образом:
Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
Сначала выводить исходный массив на экран.
Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
Выводить отсортированный массив на экран.

Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.

Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.

На входе:


'5 8 12 3 6 9'
На выходе:


Initial array:
[5, 8, 12, 3, 6, 9]
Sorted array:
[3, 5, 6, 8, 9, 12]
 */

class HeapSort {
    public static void buildTree(int[] tree, int sortLength, int i) {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        if (l < sortLength && tree[l] > tree[largest]) largest = l;
        if (r < sortLength && tree[r] > tree[largest]) largest = r;
        if (largest != i) {
            int swap = tree[i];
            tree[i] = tree[largest];
            tree[largest] = swap;
            buildTree(tree, sortLength, largest);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        for (int i = sortLength / 2 - 1; i >= 0; i--)
            buildTree(sortArray, sortLength, i);

        for (int i=sortLength-1; i>=0; i--){
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;
            buildTree(sortArray, i, 0);
        }

    }
}




public class Seminar5_DZ {

    public static void main(String[] args) {
        /* К 1й задаче:
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me")); */

        /* Ко 2й задаче:
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;

        if (args.length == 0) {
            name1 = "Elena";
            name2 = "Elena";
            name3 = "Elena";
            name4 = "Elena";
            name5 = "Ivan";
        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            name5 = args[4];
        }
        NamesCounter namesCounter = new NamesCounter();

        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);

        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences(); */

        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, -1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));



    }

}

