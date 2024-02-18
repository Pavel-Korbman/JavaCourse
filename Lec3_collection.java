// КОЛЛЕКЦИИ
// List
/* List – пронумерованный набор элементов.
Пользователь этого интерфейса имеет точный контроль над тем,
где в списке вставляется каждый элемент.
Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке)
и искать элементы в списке.
URL
ArrayList, LinkedList (Vector, Stack – устаревшие)
 */
// ArrayList  Разные способы создания
/*
ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<>();
ArrayList<Integer> list3 = new ArrayList<>(10);
ArrayList<Integer> list4 = new ArrayList<>(list3);
 */
/*
add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
get(pos) – возвращает элемент из списка по указанной позиции
indexOf(item) – первое вхождение или -1
lastIndexOf(item) – последнее вхождение или -1
remove(pos) – удаление элемента на указанной позиции и его возвращение
set(int pos, T item) – присваивание значение item элементу, который находится на позиции pos
void sort(Comparator) – сортирует набор данных по правилу
subList(int start, int end) – получение набора данных от позиции start до end
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Lec3_collection {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        // List list = new ArrayList();
        // Если не указали тип данных - будет Object  и можно класть любой тип напр строку
        ArrayList<Integer> list3 = new ArrayList<>(10);

        list.add(2809);
//        list.add("string line");
        for (Object o : list) {
            System.out.println(o);  // 2809
            // Проблема извлечения данных
        }
        list3.add(1111111111);
        for (Object o : list3) {
            System.out.println(o);  // 1111111111
            // Проблема извлечения данных
        }

        // Использование:
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]

        // Со стрингбилдером
        StringBuilder day1 = new StringBuilder("28");
        StringBuilder month1 = new StringBuilder("9");
        StringBuilder year1 = new StringBuilder("1990");
        StringBuilder[] date1 = { day1, month1, year1 };
        List<StringBuilder> d1 = Arrays.asList(date1); // Arrays.asList(date1) формирует массив
        System.out.println(d1);

        date1[1] = new StringBuilder("09");  // Можно поменять в массиве тогда поменяется и в коллекции
        System.out.println(d); // [29, 09, 1990]

        /*
        clear() – очистка списка toString() – «конвертация» списка в строку
        Arrays.asList – преобразует массив в список
        containsAll(col) – проверяет включение всех элементов из col
        removeAll(col) – удаляет элементы, имеющиеся в col
        retainAll(col) – оставляет элементы, имеющиеся в col
        toArray() – конвертация списка в массив Object’ов
        toArray(type array) – конвертация списка в массив type
        List.copyOf(col) – возвращает копию списка на основе имеющегося
        List.of(item1, item2,...) – возвращает неизменяемый список
         */

        Character value = null;
        // List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y'); // удалить элемент не получиться
        //List<Character> list1 = new ArrayList<>(List.of('S', 'e', 'r', 'g', 'e', 'y')); // удалить элемент получиться
        List<Character> list1 = new ArrayList<>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        list1.add('e');
        list1.add('y');
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1); // [S, r, g, e, y]

        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);  // [S, r, g, e, y]

        // Итератор
        /*
        Получение итератора с целью более гибкой работы с данными
        Интерфейс Iterator<E>. Итератор коллекцией.
        Iterator занимает место Enumeration в Java Collections Framework.
        Итераторы отличаются от перечислений двумя способами:
        Итераторы позволяют вызывающей стороне удалять элементы
        из базовой коллекции во время итерации с четко определенной семантикой.
        hasNext(), next(), remove()
        ListIterator<E>
        hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
         */

        List<Integer> list10 = List.of(1, 12, 123, 1234, 12345);
        // Перебераем Циклом
        for (int item : list10) {
            System.out.println(item); }

        // Перебераем Итератором
        Iterator<Integer> col = list10.iterator();  // Вызываю метод .iterator();
        while (col.hasNext()) {  // Пока есть следующий элемент перечисляем их
            System.out.println(col.next());

        }






    }
}