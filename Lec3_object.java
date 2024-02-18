//  ЛЕКЦИЯ 3.
//  Коллекции

//import java.io.File;
//import java.io.IOException;

//public class Lec3 {
//    public static void main(String[] args) throws IOException {

//    Тип данных Object – универсальный тип данных.
//    Упаковка – любой тип можно положить в переменную типа Object
//    Распаковка – преобразование Object-переменной в нужный тип
//    Иерархия типов – любой тип «ниже» Object’а

public class Lec3_object {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);    // java.lang.Integer
        o = 1.2;
        GetType(o);         // java.lang.Double
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}













