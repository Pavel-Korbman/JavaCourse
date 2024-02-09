/**
 * Lect1
 */
public class Lect1 {   // Снипет class
    public static void main(String[] args) {  //  Снипет main
        // System.out.println("hello world");  //  Снипет sysout
        String s ;  //  Объявление переменной
        //s = "Привет";  //  Инициализация переменной. Нужно всегда
        // int number; 
        // number = 777;

        float e = 2.79f;
        //e = ;

        double pi;
        pi = 3.1415;

        char symbol = '!';
        
        System.out.println(e);
        System.out.println(pi);
        System.out.println(symbol);

        boolean flag1 = 123 <= 234;
        boolean flag2 = 123 >= 234 || flag1;
        boolean flag3 = flag2 ^ flag1;

        System.out.println(flag1);  // true
        System.out.println(flag2);  // true
        System.out.println(flag3);  // false

        String a = "Привет";
        String b = "Мир";
        String c = a + b;

        System.out.println(c);  // ПриветМир

        var x = "Неявно";
        System.out.println(x);

        var y = 12345;
        System.out.println(y);
        System.out.println(getType(y));

        int number = 100_000_999;
        
        String number1 = Integer.toString(number);  // Переводим в строку используя обёртку Integer
        System.out.println(getType(number1));
        System.out.println("строка" + number1);
        System.out.println(Integer.MIN_VALUE);  // Вы вели мин значение целого числа

        String str = "qwer";
        System.out.println(str.length());  // Определили длинну слова
        
        System.out.println(str.charAt(1));  // Вывели 2ю букву


    /*
     * Операции Java 
     * ● Присваивание: = 
     * ● Арифметические: *, /, +, -, %, ++, --
     * ● Операции сравнения: <, >, ==, !=, >=, <= 
     * ● Логические операции:  ||, &&, ^, ! 
     * ● Побитовые операции <<, >>, &, |, ^
     */

        int num = 123;
        System.out.println(num ++); // Сначала выводит 123, а потом прибавляет 1
        System.out.println(num);  // выводит 124

        int num1 = 123;
        System.out.println(++num1); // Сначала прибавляет 1, а потом выводит 124,  
        
        // Логические операции:
        boolean a1 = true;
        boolean b1 = true;
        System.out.println(a1 && b1);

        // МАССИВЫ:

        int[] arr = new int[10];        
        System.out.println(arr.length); // 10  
        System.out.println(arr[3]);      
        
        arr = new int[] { 1, 2, 3, 4, 5};        
        System.out.println(arr.length); // 5
        arr[3] = 777;
        System.out.println(arr[3]);

         // ДВУМЕРНЫЕ МАССИВЫ:

        int[] array[] = new int[3][5];        
        for (int[] line : array) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }      
        
        System.out.println();

        int[][] array1 = new int[4][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.printf("%d ", array1[i][j]);
            }
            System.out.println();
        }

        // ПРЕОБРАЗОВАНИЯ:

        int i = 123; double d = i;       
        System.out.println(i);  // 123       
        System.out.println(d);  // 123.0       
        
        double d1 = 3.1415; int i1 = (int)d1;       
        System.out.println(d1);  // 3.1415       
        System.out.println(i1);  // 3       
        
        d = 3.9415; i = (int)d;       
        System.out.println(d);  // 3.9415       
        System.out.println(i);  // 3       
        
        byte b3 = Byte.parseByte("123");  // Парсим строку в числа 
        System.out.println(b3);  // 123       
        
        // b3 = Byte.parseByte("1234");       
        // System.out.println(b3);  // NumberFormatException: Value out of range

        int z = Integer.parseInt("12700");       
        System.out.println(z);

    }
    static String getType(Object o){        
        return o.getClass().getSimpleName();
    }
   
}
