// Задачки на методы

//import java.time.LocalTime;

//import java.util.Scanner;
//import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Seminar2 {

    public static void main(String[] args) throws IOException {

//        System.out.println(Task0(10, 'L', 'a'));
//        System.out.println(Task1("caaaabbbaacdd"));
//        System.out.println(Task3("Ab1Bb"));

            ToFile(WordRepeat("TEST", 10));




    }

    /* МОИ МЕТОДЫ*/

/*   Задание №1
    Дано четное число N (>0) и символы c1 и c2.
    Написать метод, который вернет строку длины N,
    которая состоит из чередующихся символов c1 и c2, начиная с c1. */

//    static String Task0(int n, char c1, char c2) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < n / 2; i++) {
//            stringBuilder.append(c1).append(c2);
//        }
//        return stringBuilder.toString();
//    }

 /*       Задание №2
    Напишите метод, который сжимает строку.
    Пример: вход caaaabbbaacdd. выход a6b3c2d2 */
//    static String Task1(String str) {
//        StringBuilder stringBuilder = new StringBuilder();
//        char[] arr = str.toCharArray();
//        Arrays.sort(arr);
//        int count = 1;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == arr[i - 1]) count++;
//            else {
//                stringBuilder.append(arr[i-1]).append(count);
//                count = 1;
//                }
//        }
//        stringBuilder.append(arr[arr.length-1]).append(count);
//        return stringBuilder.toString();
//    }

    /* Задание №3
    Напишите метод, который принимает на вход строку (String)
    и определяет является ли строка палиндромом (возвращает boolean значение).
     */
//    static boolean Task3(String str) {
//        str = str.toLowerCase();
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(str);
//        if (stringBuilder.reverse().toString().equals(str)) return true; // equals() сравнивает строки
//        else return false;
//    }

    /* Задание №4
  Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
  и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
  Сделать логгирование.
     */
    static String WordRepeat(String word, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(word).append(' ');
        }
        stringBuilder.append("\n");
        return stringBuilder.toString().trim();
//        return word.repeat(n);  // Повторяет в строке слова n раз
    }
//    Метод без логгера
//    static void ToFile(String str) {
//        try {
//            FileWriter fileWriter = new FileWriter("sem2test.txt", true);
//            fileWriter.write(str);  // Не запишет без .flush()
//            fileWriter.append("\n");
//            fileWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();  // Выводит ошибку в терминал
//            throw new RuntimeException(e);
//        }

        //    Метод с логгером
    static void ToFile(String str) throws IOException {
        Logger logger = Logger.getAnonymousLogger();  // Обычный логер, но без имени
        FileHandler fileHandler = new FileHandler("log2.txt", true);
        // Метод для записи логов в файл (true - логи будут дописываться),

        logger.addHandler(fileHandler);  // Привязываем логер к файлу файлхендлера

        SimpleFormatter simpleFormatter = new SimpleFormatter();
        // Метод для форматирования логов - создаёт 2х строчные логи с осн информацией

        fileHandler.setFormatter(simpleFormatter); // Привязываем форматер к хендлеру

        try {
                FileWriter fileWriter = new FileWriter("//sem2test.txt", true);
                // Сделал ошибку в имени файла для логирования

                fileWriter.write(str);  // Не запишет без .flush()
                fileWriter.append("\n");
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();  // Выводит ошибку в терминал
                logger.log(Level.INFO, e.getMessage());  // .getMessage() автоматически формирует сообщения об ошибке е.
                throw new RuntimeException(e);
            }

    }



}
