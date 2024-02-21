package Seminars;
// КОЛЛЕКЦИИ

import java.util.*;



public class Seminar4 {

    public static void main(String[] args) {
        //task0();
        task1();

        //System.out.println(bookShop);

    }
     /* Задание №0
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
        Сравните с предыдущим.
         */
    static void task0(){
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        long start = System.currentTimeMillis(); // Возвращает количество милисекунд с 1 янв 1970
        for (int i = 0; i < 100000; i++) {
            list1.add(0, i); // Добавляем в начало
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);  // 383
        System.out.println(finish - middle);  // 5
    }

    /* Задание №1
        Реализовать консольное приложение, которое:
        1. Принимает от пользователя строку вида text~num
        2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
    static void task1(){
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите строку: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            switch (text){
                case "print" :
                    System.out.println(list.remove(num));
                    break;
                case "exit" :
                    System.out.println("До свидания.");
                    work = false;
                    break;
                default: list.add(num, text);
            }

        }

    }



}

