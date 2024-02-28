/*
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать,
что в во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
 */

import java.util.*;

public class Main {
    static Map<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        add("Билл Гейтс", "1234568");
        add("Стив Возняк", "9990333");
        add("Билл Гейтс", "1234567");
        add("Илон Маск", "7890111");
        add("Илон Маск", "7890110");
        add("Марк Цукерберг", "9990125");
        add("Илон Маск", "7890112");
        add("Билл Гейтс", "1234569");
        add("Стив Возняк", "9990443");
        add("Павел", "01");
        add("Павел", "02");
        add("Павел", "022");
        add("Павел", "03");
        add("Павел", "00");

        printAll(phoneBook);
        find("Марк Цукерберг");
    }

    static void add(String name, String phone) {
        ArrayList<String> phoneS = new ArrayList<>();
        if (!phoneBook.containsKey(name)) {
            phoneS.add(phone);
        } else {
            phoneS.addAll(phoneBook.get(name));
            phoneS.add(phone);
        }
        phoneBook.put(name, phoneS);
    }

    static void printAll(Map<String, List<String>> Col) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        for (var item : phoneBook.entrySet()) {
            treeMap.put(item.getValue().size() + item.getKey(), item.getKey() + "=" + item.getValue());
        }
        System.out.println(treeMap.descendingMap().values());
    }

    static void find(String name) {
        if (phoneBook.containsKey(name)) System.out.println(name + "=" + phoneBook.get(name));
        else System.out.println(name + " - такого имени нет в телефонной книге");
    }

}