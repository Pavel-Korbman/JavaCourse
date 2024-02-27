package Seminars;
// МНОЖЕСТВО КОЛЛЕКЦИЙ MAP

import java.lang.reflect.Array;
import java.util.*;


public class Seminar5 {


    public static void main(String[] args) {
        //task0();
//        System.out.println(task1("paper", "title"));
//        System.out.println(task1("foo", "bar"));
        //System.out.println(task2("{a+]}{(d*3)}"));
        String a = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        task31(a);
    }


     /* Задание №0
        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов

        Вывести данные по сотрудникам с фамилией Иванов или по номеру паспорта или вывести всё.
         */

// Создадим новый класс: public class Passport (в файле Passport.java)

    static void task0() {
        Passport passport = new Passport();
        passport.add("123456", "Иванов");
        passport.add("321456", "Васильев");
        passport.add("234561", "Петрова");
        passport.add("234432", "Иванов");
        passport.add("654321", "Петрова");
        passport.add("345678", "Иванов");


        System.out.println(passport.getAll());
        // {234561=Петрова, 123456=Иванов, 654321=Петрова, 234432=Иванов, 321456=Васильев, 345678=Иванов}
        System.out.println();
        System.out.println(passport.getByLastName("Ивановы")); // Ивановы - Такой фамилии нет
        System.out.println();
        System.out.println(passport.getByPassNum("3214500"));  // 3214500 - Такого номера нет
        System.out.println();
        System.out.println(passport.getByLastName("Иванов"));
//        123456:Иванов
//        234432:Иванов
//        345678:Иванов
        System.out.println();
        System.out.println(passport.getByPassNum("234561"));  // 234561:Петрова

    }

    /* Задание №1
    Даны 2 строки,
    написать метод, который вернет true, если эти строки являются изоморфными
    и false, если нет.
    Строки изоморфны, если одну букву в первом слове
    можно заменить на некоторую букву во втором слове,
    при этом:
    1. повторяющиеся буквы одного слова меняются на одну и ту же букву
    с сохранением порядка следования. (Например, add - egg изоморфны)
    2. буква может не меняться, а остаться такой же. (Например, note - code)

    Пример 1:
    Input: s = "foo", t = "bar"
    Output: false
    Пример 2:
    Input: s = "paper", t = "title"
    Output: true
        */
    static boolean task1(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(c1[i])) {
                if (map.get(c1[i]) != c2[i]) return false;
            } else map.put(c1[i], c2[i]);


        }
        return true;
    }

    /* Задание №2
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
    */
    // МОЁ РЕШЕНИЕ
    /*
    static boolean task2(String str) {
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        map.put('<', '>');
        for (var item : map.entrySet()) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] == item.getKey()) stack.push(c[i]);
                if (c[i] == item.getValue()) {
                    if (stack.isEmpty() || stack.pop() != item.getKey()) return false;
                }
            }
        }
       return stack.isEmpty();
    }
*/
    // СЕМИНАРСКОЕ РЕШЕНИЕ

    static boolean task2(String str) {
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        map.put('<', '>');

        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) stack.push(c[i]);
            if (map.containsValue(c[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) != c[i]) return false;
            }
        }

        return stack.isEmpty();
    }

    /* Задание №3
Взять набор строк, например,

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный Пора красавица проснись.

Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
Строки с одинаковой длиной не должны “потеряться”.
   */
    // МОЁ РЕШЕНИЕ
    static TreeMap<Integer, String> task3(String str) {
        TreeMap<Integer, String> tMap = new TreeMap();
        String[] string = str.split(" ");
        for (int i = 0; i < string.length; i++) {
            if (!tMap.containsKey(string[i].length())) tMap.put(string[i].length(), string[i]);
            else {
                String temp = tMap.get(string[i].length()) + "," + string[i];
                tMap.put(string[i].length(), temp);
            }

        }
        return tMap;
    }

    // СЕМИНАРСКОЕ РЕШЕНИЕ
    static void task31(String str) {
        TreeMap<Integer, List<String>> tMap = new TreeMap();
        String[] values = str.split(" ");
        for (int i = 0; i < values.length; i++) {
            int lenghtWord = values[i].length();
            if (tMap.containsKey(lenghtWord)) {
                List<String> list = tMap.get(lenghtWord);
                list.add(values[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(values[i]);
                tMap.put(lenghtWord, list);
            }
        }
        System.out.println(tMap);
    }


}

