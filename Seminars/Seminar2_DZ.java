import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;
import java.io.IOException;
import java.util.logging.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Date;

public class Seminar2_DZ {
    public static void main(String[] args) throws IOException {
//        String QUERY = "";
//        String PARAMS = "";
//        QUERY = "select * from students where ";
//        PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"null\", \"age\":\"15\"} ";
//        System.out.println(answer(QUERY, PARAMS).toString());
        int[] arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
//        System.out.println(Arrays.toString(sort(arr)));
        sort(arr);


    }

    //    Задача 1
/* Дана строка sql-запроса:
    select * from students where "
    Сформируйте часть WHERE этого запроса, используя StringBuilder.
    Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже.
    Если значение null, то параметр не должен попадать в запрос.

    Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
    String QUERY - начало SQL-запроса
    String PARAMS - JSON с параметрами

    Пример: Строка sql-запроса:
    select * from students where
    Параметры для фильтрации:
    {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    Результат:
    select * from students where name='Ivanov' and country='Russia' and city='Moscow'

 */
//    public static StringBuilder answer(String QUERY, String PARAMS) {
//        PARAMS = PARAMS.replace('"', ' ').replace(':', ' ').replace(',', ' ')
//                .replace('{', ' ').replace('}', ' ').trim();;
//        String[] arr = PARAMS.split("   ");
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(QUERY);
//        if (!Objects.equals(arr[1], "null")) {
//            stringBuilder.append("name='").append(arr[1]).append("'");
//            if (!Objects.equals(arr[3], "null")) stringBuilder.append(" and ").append("country='").append(arr[3]).append("'");
//            if (!Objects.equals(arr[5], "null")) stringBuilder.append(" and ").append("city='").append(arr[5]).append("'");
//            if (!Objects.equals(arr[7], "null")) stringBuilder.append(" and ").append("age='").append(arr[7]).append("'");
//        } else if (!Objects.equals(arr[3], "null")){
//            stringBuilder.append("country='").append(arr[3]).append("'");
//            if (!Objects.equals(arr[5], "null")) stringBuilder.append(" and ").append("city='").append(arr[5]).append("'");
//            if (!Objects.equals(arr[7], "null")) stringBuilder.append(" and ").append("age='").append(arr[7]).append("'");
//        } else if (!Objects.equals(arr[5], "null")){
//            stringBuilder.append("city='").append(arr[5]).append("'");
//            if (!Objects.equals(arr[7], "null")) stringBuilder.append(" and ").append("age='").append(arr[7]).append("'");
//        } else if (!Objects.equals(arr[7], "null")){
//            stringBuilder.append("age='").append(arr[7]).append("'");
//        }
//        return stringBuilder;
//
//    }
    public static void sort(int[] mas) throws IOException {
        FileWriter fw = new FileWriter("log.txt", false);
        fw.write("");
        fw.flush();
        boolean dann = false;

        while (! dann){
            dann = true;
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j + 1] < mas[j]) {
                    dann = false;
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }

            }
            logger(mas);
        }
//        logger(mas);
    }

    public static void logger(int[] arr) throws IOException {
        java.time.LocalDate localDate = java.time.LocalDate.now();
        java.time.LocalTime time = java.time.LocalTime.now();
        LocalTime timeres = LocalTime.of(time.getHour(),time.getMinute());
        FileWriter fw = new FileWriter("log.txt", true);
        fw.append(localDate.toString());
        fw.append(' ');
        fw.append(timeres.toString());
        fw.append(' ');
        fw.append(Arrays.toString(arr));
        fw.append('\n');
        fw.flush();
    }


}
