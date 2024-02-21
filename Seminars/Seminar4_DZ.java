package Seminars;
// КОЛЛЕКЦИИ


import java.util.*;

public class Seminar4_DZ {

    public static void main(String[] args) {
//        LinkedList<Object> ll = new LinkedList<>();
//        ll.add(1);
//        ll.add("One");
//        ll.add(2);
//        ll.add("Two");
//        System.out.println(revert(ll));


//        MyQueue<Integer> queue;
//        queue = new MyQueue<>();
//
//        queue.enqueue(1);
//        queue.enqueue(10);
//        queue.enqueue(15);
//        queue.enqueue(5);
//
//        System.out.println(queue.getElements());
//
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.getElements());
//
//        System.out.println(queue.first());
        int a, b, c, d;
        char op, op2, undo;
        a = 3;
        op = '+';
        b = 7;
        c = 4;
        op2 = '+';
        d = 7;
        undo = '<';
        Calculator calculator = new Calculator();
        Double result = calculator.calculate(op, a, b);
        System.out.println(result);
        Double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        Double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);




    }

    /*Задача 1.
    Дан LinkedList с несколькими элементами разного типа.
    В методе revert класса LLTasks реализуйте разворот этого списка
    без использования встроенного функционала.

    // Дан
[1, One, 2, Two]

// Вывод
[1, One, 2, Two]
[Two, 2, One, 1]

     */

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> res = new LinkedList<>();
        for (Object el : ll) {
            res.addFirst(el);
        }
        return res;
    }


}

 /*Задача 2.
    В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:

enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди

Пример:
queue.enqueue(1);
queue.enqueue(10);
queue.enqueue(15);
queue.enqueue(5);
System.out.println(queue.getElements());

Результат:

[1, 10, 15, 5]
queue.dequeue();
queue.dequeue();
System.out.println(queue.getElements());
Результат:

 [15, 5]
System.out.println(queue.first());
Результат:

15

     */

class MyQueue<T> {
    Queue<T> queue = new LinkedList<>();

    public void enqueue(T element) {
        // Напишите свое решение ниже
        queue.add(element);
    }

    public T dequeue() {
        // Напишите свое решение ниже
        return queue.remove();
    }

    public T first() {
        // Напишите свое решение ниже
        return queue.peek();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return (LinkedList<T>) queue;
    }
}

     /*Задача 3.
   В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
   Отмена последней операции должна быть реализована следующим образом:
   если передан оператор '<' калькулятор должен вывести результат предпоследней операции.

calculate('+', 3, 7)
calculate('+', 4, 7)
calculate('<', 0, 0)

// 10.0
// 11.0
// 10.0

calculate('*', 3, 2)
calculate('-', 7, 4)
calculate('<', 0, 0)

// 6.0
// 3.0
// 6.0
     */

class Calculator {
    Deque<Double> ll = new ArrayDeque<>();
    public Double calculate(char op, int a, int b) {
        if (op == '+') ll.addLast((double) (a+b));
        if (op == '-') ll.addLast((double) (a-b));
        if (op == '*') ll.addLast((double) (a*b));
        if (op == '/') ll.addLast((double) (a/b));
        if (op == '<') ll.removeLast();
        return ll.getLast();


    }
}

