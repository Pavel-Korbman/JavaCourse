//  ЛЕКЦИЯ 3.
//  Коллекции


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

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
        System.out.println(Sum("каша", "маша"));

        //    Массивы
//Проблема.Как увеличить размер массива?
// Есть массив из 2 элементов
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);  // Копирование элементов с нулевого из массива а в мас. b

        for (int i : a) { System.out.printf("%d ", i);}  // 1 9
        System.out.println();
        for (int j : b) { System.out.printf("%d ", j);}  // 1 9 0
        System.out.println();

        // Добавляем элемент своим методом AddItem

        int[] a1 = new int[] { 0, 9 };
        for (int i : a1) { System.out.printf("%d ", i); } // 0 9
        a1 = AddItem(a1, 2);
        a1 = AddItem(a1, 3);
        System.out.println();
        for (int j : a1) { System.out.printf("%d ", j); }  //  0 9 2 3



    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {  // Если a и b принадлежат типу Double
            return  (Object)((Double) a + (Double) b);
            // распаковываем a и b в тип Double, складываем и запаковываем обратно в Object

        } else if(a instanceof Integer && b instanceof Integer) {  // Если a и b принадлежат типу Integer
            return (Object)((Integer) a + (Integer) b);
            // распаковываем a и b в тип Integer, складываем и запаковываем обратно в Object

        } else return 0;
    }

    static int[] AddItem(int[] array, int item) {  // Добавление элемента к массиву
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }




}













