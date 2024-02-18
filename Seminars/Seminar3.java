package Seminars;
// КОЛЛЕКЦИИ

import java.util.*;



public class Seminar3 {

    public static void main(String[] args) {
        //task0();
        System.out.println(task1());

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

}

