import java.util.Scanner;

public class Lect1p2 {
    public static void main(String[] args) {

    
    
        // Scanner iScanner = new Scanner(System.in);
        // // System.out.printf("Ваше имя: ");
        // // String name = iScanner.nextLine();
        
        // // System.out.printf("Привет, %s!\n", name);
        // System.out.printf("Int a: ");
        // int x = iScanner.nextInt();

        // System.out.printf("Double a: ");
        // double y = iScanner.nextDouble();
        
        // System.out.printf("%d + %f = %f", x, y, x + y);
        
        // iScanner.close();
/*
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);              
        
        iScanner.close();
        */
        
        // Форматированный вывод

        int a = 1, b = 2;
        int c = a + b;        
        String res = a + " + " + b + " = " + c;        
        System.out.println(res);

        String res1 = String.format("%d + %d = %d \n", a, b, c);        
        System.out.printf("%d + %d = %d \n", a, b, c);        
        System.out.println(res1);
        /*
         * %d: целочисленных значений 
         * %x: для вывода шестнадцатеричных чисел 
         * %f: для вывода чисел с плавающей точкой 
         * %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01 
         * %c: для вывода одиночного символа 
         * %s: для вывода строковых значений
         */

        float pi = 3.1415f;        
        System.out.printf("%f\n", pi);    // 3,141500        
        System.out.printf("%.2f\n", pi);  // 3,14        
        System.out.printf("%.3f\n", pi);  // 3,141        
        System.out.printf("%e\n", pi);    // 3,141500e+00        
        System.out.printf("%.2e\n", pi);  // 3,14e+00        
        System.out.printf("%.3e\n", pi);  // 3,141e+00
    
         
        // Области видимости переменных:
            {
                int i1 = 777;           
                System.out.println(i1);  
            }
            
        int i1 = 123;         
        System.out.println(i1);

        // ФУНКЦИИ И МЕТОДЫ:

        sayHi();
        sum(100, 77);
        factor(3);
        
        // Вызов из файла lib1.java
        
        lib1.sayHiru();
        System.out.println(lib1.sum(700, 77));
        System.out.println(lib1.factor(4));

        // УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ:
        
        // Условный оператор:
        
        int a4 = 1;        
        int b4 = 22;        
        int c4;        
        if (a4 > b4) {            
            c4 = a4;        
        } else {            
            c4 = b4;        
        }        
        
        System.out.println(c4);

        int a5 = 100;        
        int b5 = 200;        
        int c5 = 0;
        if (a5>b5) c5 = a5;
        if (b5>a5) c5 = b5;

        System.out.println(c5);


        // Тернарный оператор:

        int a6 = 10;        
        int b6 = 22;        
        int min = a6 < b6 ? a6 : b6;        
        
        System.out.println(min);


        // Оператор выбора:

        int mounth = 5;        
        String text = "";        
        switch (mounth) { 
            case 1:
            case 2:
            case 3:
            case 4:           
            case 5:                
                text = "Autumn";                
                break;           
            case 777: text = "mistake";
                break;              
            // default:                
            //     text = "по умолчанию";                
            //     break;        
        }        
        System.out.println(text);
        
        // ЦИКЛЫ:

        // WHILE:
        int value = 3210;        
        int count = 0;        
        while (value != 0) {            
            value /= 10;            
            count++;        
        }        
        System.out.println(count);

        // DO WHILE:
        int value1 = 3210;        
        int count1 = 0;  
        do {
            value1 /= 10;            
            count1++;    
        } while (value1 != 0);
        System.out.println(count1);

        // FOR:
        for (int i = 0; i<10; i++){
            if (i % 2 ==0)
                continue;
            System.out.println(i);   // Печатаем только нечётные
        }

        int s = 0;        
        for (int i = 1; i <= 10; i++) {            
            s += i;        
        }        
        System.out.println(s);

        // Вложенные циклы:
        
        for (int i = 0; i < 5; i++) {            
            for (int j = 0; j < 5; j++) {                
                System.out.print("* ");            
            }            
            System.out.println();
        }
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        
         // FOR IN (для коллекций): снипет FOREACH
        int arr[] = new int[10];        
        for (int item : arr) {            
            System.out.printf("%d ", item);        
        }        
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.printf("%d ", arr[i]);
        }

        

        






        
        




     

    }

      
    static void sayHi(){
        System.out.println("Hi"); 
    }

    // Сумма двух целых
    static int sum(int a, int b) {        
        return a+b;    
    }      
    
    // Факториал (с рекурсией)    
    static double factor(int n) {        
        if(n==1)return 1;        
        return n * factor(n-1);    
    }

    
}
