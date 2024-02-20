//  ЛЕКЦИЯ 4.
//    LinkedList - Представляет собой двусвязный список.
// Список – гибкая структура данных,
// позволяющая легко менять свой размер.
// Элементы доступны для вставки или удаления в любой позиции.
// LinkedList (список) выгоден для небольшого количества элементов,
// в которых операции добавления\удаления встречаются чаще операций чтения.

// Массив выгоднее там, где больше требуется чтение


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

public class Lec4 {
    public static void main(String[] args) {
//    Коллекция LinkedList (двусвязный список)
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(23);
        ll.add(338);
        System.out.println(ll);

//    Коллекция Queue (простая очередь - кто первый, тот первый обработан)
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
//        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();  // Удаляется первый элемент
//        System.out.println(item);
//        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        queue.remove();
//        System.out.println(queue); // [3, 4, 2809]
//        System.out.println(queue.peek());
        queue.remove();
//        System.out.println(queue); // [4, 2809]
        item = queue.remove();
//        System.out.println(queue); // [2809]
//        System.out.println(queue.peek()); // Выводим первый элемент

//    Коллекция PriorityQueue (наивысший приоритет у наименьшего элемента - сначала маленькие)
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
//        System.out.println(pq);  // [1, 3, 13, 123]
//        System.out.println(pq.poll()); // 1
//        System.out.println(pq.poll());  // 3
//        System.out.println(pq.poll());  // 13
//        System.out.println(pq.poll());  // 123
//        System.out.println(pq.poll());  // null
//        System.out.println(pq);

//    Коллекция Dequeue поддерживает вставку и удаление с обоих концов
        Deque<Integer> deque = new ArrayDeque<>();

/*
        deque.addFirst(1);  // Добавить в начало
        deque.addLast(2);  // Добавить в конец

        deque.removeLast();  // Удалить - извлечь начало
        deque.removeLast();// Удалить - извлечь конец

        deque.offerFirst(1);  // Посмотреть начало
        deque.offerLast(2);  // Посмотреть конец

        deque.pollFirst();
        deque.pollLast();

        deque.getFirst();
        deque.getLast();

        deque.peekFirst();
        deque.peekLast();  */

//    Коллекция Stack обрабатывает данные с конца. (Устаревшая как и Vector)
//    Расширяет Vector пятью операциями, которые позволяют рассматривать вектор как стек.
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1

    }
}














