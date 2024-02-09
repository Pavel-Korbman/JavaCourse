/**
 * Lect1p2
 */
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
          
            {
                int i = 777;           
                System.out.println(i);  
            }
            
         int i = 123;         
         System.out.println(i);






    }

    
}
