// РАБОТА С ФАЙЛАМИ



// Для записи и перезаписи
// Для вывода ошибок
import java.io.*;  // Для чтения

public class Lec1p3 {
    public static void main(String[] args)  throws Exception {
    
        // Создание и запись\ дозапись
        /*
        try (FileWriter fw = new FileWriter("file.txt", true)) { // Можно без try catch если в main дописанно throws Exception
            fw.write("line 1");            
            fw.append('\n');            
            fw.append('2');            
            fw.append('\n');            
            fw.write("line 3"); 
            fw.append('\n');   
            fw.flush();  
        } catch (IOException ex) { 
            System.out.println(ex.getMessage()); 
        }
        */
        FileWriter fw = new FileWriter("file.txt", false);
        fw.write("line 1");            
        fw.append('\n');            
        fw.append('7');
        fw.append('7');
        fw.append('7');           
        fw.append('\n');            
        fw.write("line 3"); 
        fw.append('\n');   
        fw.flush();  
        
        // Чтение посимвольно
        
        FileReader fr = new FileReader("file.txt");        
        int c;        
        while ((c = fr.read()) != -1) {            
            char ch = (char) c;            
            if (ch == '\n') {                
                System.out.print(ch);            
            } else {                
                System.out.print(ch);            
            }        
        }
        
        System.out.println();
        System.out.println();

        // Чтение построчно

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));        
        String str;        
        while ((str = br.readLine()) != null) {            
            System.out.printf("- %s -\n", str);        
        }        
        br.close();
       
    
    }
}
