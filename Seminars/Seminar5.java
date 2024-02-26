package Seminars;
// МНОЖЕСТВО КОЛЛЕКЦИЙ MAP

import java.util.*;



public class Seminar5 {


    public static void main(String[] args) {
        task0();


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

    static void task0(){
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



}

