package Seminars;
// КОЛЛЕКЦИИ

import java.util.*;



public class Seminar3 {

    public static void main(String[] args) {
        //task0();
//        System.out.println(task1());
//        task2();
//        task3();
        List<ArrayList<String>> bookShop = new ArrayList<>();
        addBook("Война и мир", "Проза", bookShop );
        addBook("Бородино", "Поэзия", bookShop );
        addBook("Бег", "Проза", bookShop );
        addBook("Мцири", "Поэзия", bookShop );
        addBook("Малая земля", "Док", bookShop );
        System.out.println(bookShop);

    }
     /* Задание №0
        Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
         */
    static void task0(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2);  // true
        System.out.println(s2 == s3);  // true
        System.out.println(s3 == s4);  // true
        System.out.println(s4 == s5);  // false
        System.out.println(s5 == s6);  // false

        // Вывод:
        // Ссылочные типы данных (которые с большой буквы напр String)
        // нужно сравнивать методом equals()
        System.out.println(s1.equals(s2));  // true
        System.out.println(s2.equals(s3));  // true
        System.out.println(s3.equals(s4));  // true
        System.out.println(s4.equals(s5));  // true
        System.out.println(s5.equals(s6));  // true
    }
    /*  Задание №1
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.
         */
    static List<Integer> task1(){
        List<Integer> list = new ArrayList<>();
        //Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
            //list.add(random.nextInt());
        }
        //Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder()); // В обратном направлении

        //System.out.println();
        return list;
    }

     /*  Задание №2.1
     Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
     Вывести название каждой планеты и количество его повторений в списке.
     Задание состоит из двух блоков
         Задание №2.2 (если выполнено первое задание)
     Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
         */
     static void task2(){
         List<String> planets = new ArrayList<>(List.of("Марс", "Сатурн", "Юпитер", "Земля", "Юпитер", "Марс", "Сатурн"));

//         System.out.println(planets);
         System.out.println("Марс: " + Collections.frequency(planets, "Марс"));
         System.out.println("Сатурн: " + Collections.frequency(planets, "Сатурн"));
         System.out.println("Юпитер: " + Collections.frequency(planets, "Юпитер"));
         System.out.println("Земля: " + Collections.frequency(planets, "Земля"));
         List<String> uplanets = new ArrayList<>();
         for (String el : planets) {
             if (!uplanets.contains(el)) uplanets.add(el);
         }
         System.out.println(uplanets);
         }

     /*  Задание №3
     Создать список типа ArrayList<String>.
     Поместить в него как строки, так и целые числа.
     Пройти по списку, найти и удалить целые числа.
         */
     static void task3(){
         ArrayList list8 = new ArrayList<>();
         list8.add("Строка1");
         list8.add(123);
         list8.add("Строка2");
         list8.add(46.99);
         list8.add("Строка1");
         list8.add(245);
         System.out.println(list8);

         Iterator iterator = list8.iterator(); // Создаём итератор списка
         while (iterator.hasNext()) {  // Проходим по списку пока есть следующий элемент
             if (iterator.next() instanceof Integer) {  // iterator.next() - возвращает элемент,
                 // instanceof Integer проверяет элемент на целочисленность
                 iterator.remove();  // Удаляет элемент
             }
         }
         System.out.println(list8);
     }

      /*  Задание №4
     Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
     что на 0й позиции каждого внутреннего списка содержится название жанра,
     а на остальных позициях - названия книг.
     Напишите метод для заполнения данной структуры.

     Проза          Поэзия         Док
     Война и мир    Бородино
     12 стульев
         */

    static void addBook(String name, String ganre, List<ArrayList<String>> bookShop){
        for (int i = 0; i < bookShop.size(); i++) {
            if (bookShop.get(i).get(0).equals(ganre)){  // Проверяем равен ли жанру нулевой элемент каждого списка
                List<String> list = bookShop.get(i);
                list.add(name);
                return;
            }
        }
        ArrayList<String> list= new ArrayList<>(); // Если такого жанра нет - создаём список с ним
        list.add(ganre);
        list.add(name);
        bookShop.add(list);

    }
}

