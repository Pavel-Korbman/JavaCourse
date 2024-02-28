//  ЛЕКЦИЯ 6. ООП
// ОБЪЕКТНО ОРИЕНТИРОВАННОЕ ПРОГРАММИРОВАНИЕ

import java.util.Arrays;
import java.util.HashSet;

public class Lec6_OOP {
    public static void main(String[] args) {
        // В клиентском коде (который обрабатывает экземпляры) создаём экземпляры класса Worker

        Worker w1 = new Worker();  // Конструктор
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1);  // Печатает хэш код: Worker@5b480cf9.
        // Нужно в классе задать метод toString() c форматом вывода работника

        System.out.println(w2); // id:2000, Имя:Имя_2, Фамилия:Фамилия_2, Зарплата:200
        System.out.println(w3);
        //#endregion

        System.out.println(w1==w4);  // false - Экземпляры с одинаковыми данными в полях не равны
        System.out.println(w1.equals(w4));  // true - Экземпляры с одинаковыми id и firstName равны по методу .equals (в классе Worker)
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3)); // Создадим коллекцию работников
        System.out.println(workers.contains(w4));


    }

}