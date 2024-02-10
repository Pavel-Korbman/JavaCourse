public class lib1 {

    // Приветствие

    static void sayHiru(){
        System.out.println("Большой привет");
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
