//  ЛЕКЦИЯ 5.

//  Map – это множество коллекций,
//  работающих с данными по принципу <Ключ / Значение>.
//  Ключевые особенности:
//  ● ускоренная обработка данных;
//  ● порядок добавления не запоминается.

//    HashMap
//  В HashMap элементы располагаются как угодно
//  и могут менять свое положение.
// Ключевые особенности:
// ● допускаются только уникальные ключи, значения могут повторяться;
// ● помните про null значения* (ключ - пустая ссылка);
// ● ускоренная обработка данных;
// ● порядок добавления не запоминается.

// ОСНОВНОЙ ФУНКЦИОНАЛ HashMap:
/*
put(K,V) – добавить пару если ключа нет или изменить значение, если ключ имеется.
putIfAbsent(K,V) – произвести добавление если ключ не найден.
get(K) - получение значения по указанному ключу.
remove(K) – удаляет пару по указанному ключу.
containsValue(V) – проверка наличия значения.
containsKey(V) – проверка наличия ключа.
keySet() – возвращает множество ключей.
values() – возвращает набор значений.
 */


import java.util.*;

public class Lec5 {
    public static void main(String[] args) {
//        Map<Integer, String> db = new HashMap<>();
//        db.put(1, "один"); System.out.println(db);
//        db.put(2, "два"); System.out.println(db);
//        db.put(3, "три"); System.out.println(db);
//        db.put(31, "три один"); System.out.println(db);
//        db.put(13, "один три"); System.out.println(db);
//        db.put(null, "!null"); System.out.println(db);
//        db.put(null, null); System.out.println(db);

        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");  // Добавление с проверкой (если ключ уже есть - не добавляется)
        db.put(2, "два");  // Добавление
        db.put(null, "!null");
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44)); // Вывести значение
        //db.remove(null);
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true - проверка есть ли значение
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true  - проверка есть ли ключ
        System.out.println(db.keySet()); // Все ключи
        System.out.println(db.values());  // Все значения
        System.out.println();

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        System.out.println();

//        Как ускорить работу -
//        Map<Integer, String> map1 = new HashMap<>();
//        Map<Integer, String> map2 = new HashMap<>(9);
//        Map<Integer, String> map3 = new HashMap<>(9, 1.0f);
//
//        Map<Integer, String> map1 = new HashMap<>();  // Произвольное кол элементов
//        Map<Integer, String> map2 = new HashMap<>(30);  // 30 элементов
//
//        Map<Integer, String> map3 = new HashMap<>(30, 0.8f);
//        // 30 элементов, увеличиваем длинну, если заполнено 80% элементов

        //    TreeMap - пары упорядочиваются по ключу

        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "один");
        System.out.println(tMap);       // {1=один}
        tMap.put(6, "шесть");
        System.out.println(tMap);       // {1=один, 6=шесть}
        tMap.put(4, "четыре");
        System.out.println(tMap);       // {1=один, 4=четыре, 6=шесть}
        tMap.put(3, "три");
        System.out.println(tMap);       // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2, "два");
        System.out.println(tMap);       // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

        System.out.println(tMap.descendingMap());  // {6=шесть, 4=четыре, 3=три, 2=два, 1=один}
        System.out.println(tMap.keySet());  //  [1, 2, 3, 4, 6]
        System.out.println(tMap.descendingKeySet());  //  [6, 4, 3, 2, 1]
        System.out.println(tMap.tailMap(2));  // {2=два, 3=три, 4=четыре, 6=шесть}
        System.out.println(tMap.headMap(3));  // {1=один, 2=два}
        System.out.println(tMap.lastEntry());  // 6=шесть
        System.out.println(tMap.firstEntry());  // 1=один

        System.out.println();

        //    LinkedHashMap - Помнит порядок добавления элементов ➜ более медлительный

        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}

        Map<Integer, String> map = new HashMap<>();  // В сравнении с HashMap
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}
        System.out.println();

        //    HashTable - «Устаревший брат»  коллекции HashMap, который не знает про null

        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); //  java.lang.NullPointerException ОШИБКА

        //   Все комманды как в коллекции HashMap


    }
}














