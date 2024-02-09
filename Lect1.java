/**
 * Lect1
 */
public class Lect1 {   // Снипет class
    public static void main(String[] args) {  //  Снипет main
        // System.out.println("hello world");  //  Снипет sysout
        String s ;  //  Объявление переменной
        s = "Привет";  //  Инициализация переменной. Нужно всегда
        int number; 
        number = 777;

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





    }

   
}
/*
 * Многострочный 
 * коммент
 */