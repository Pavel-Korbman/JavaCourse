public class Seminar1 {
    public static void main(String[] args) {     
        //System.out.println(countNTriangle(0));
        // printPrimeNums();
        System.out.println(calculate('+', 9, 12));
    }

    // static int countNTriangle(int n){
    //     if (n < 1){
    //         return -1;
    //     } else {
    //         int res = 0;
    //         for (int i = 1; i <= n; i++) res +=i;
    //     return res;
    //     }

    // }

    
    // static void printPrimeNums(){
        
    //     boolean prime = true;        
    //     for (int i = 2; i <= 1000; i++) {
    //         for (int j = 2; j < i; j++) {
    //             if (i % j == 0)prime = false;                          
    //         }
    //         if (prime == true) System.out.printf("%d\n", i);        
    //         prime = true;    
    //     }   
    // }
           
    static double calculate(char op, int a, int b) {
        
        prnt(op);
        // if ((op != '+') && (op != '-') && (op != '/') && (op != '*')) return -13;
        
        double res = 0;
        if (op == '+') res = (double)a + (double)b;
        if (op == '-') res = (double)a - (double)b;
        if (op == '/') res = (double)a / (double)b;
        if (op == '*') res = (double)a * (double)b;
        return res;
        
    }     
    
    static void prnt(char op) {
        
    if ((op != '+') && (op != '-') && (op != '/') && (op != '*')){
        System.out.println("Некорректный оператор: " + op);
    } else {
        System.out.println("Rорректный");
    }
    }
}
