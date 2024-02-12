//  ЛЕКЦИЯ 2.
//  Почему вы не можете не использовать API
import java.io.File;
public class Lec2 {
    public static void main(String[] args) {

        //    Создать строку из 1 млн плюсиков. Как?
/*
        String str = "";                         // Выполняется примерно 41 000 ms - 41 сек
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
// ≈

        StringBuilder sb = new StringBuilder();  // // Выполняется примерно 9 ms
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
*/
        /* StringBuilder sb = new StringBuilder()
        concat(): объединение строк
valueOf(): преобразует Object в строковое представление (завязан на toString())
join(): объединяет набор строк в одну с учетом разделителя
charAt(): получение символа по индексу
indexOf(): первый индекс вхождения подстроки
lastIndexOf(): последний индекс вхождения подстроки
startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
replace(): замена одной подстроки на другую
trim(): удаляет начальные и конечные пробелы
substring(): возвращает подстроку, см.аргументы
toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
сompareTo(): сравнивает две строки
equals(): сравнивает строки с учетом регистра
equalsIgnoreCase(): сравнивает строки без учета регистра
regionMatches(): сравнивает подстроки в строках*/

//        РАБОТА С ФАЙЛАМИ

//      File <имя> = new File(<полный путь к файлу>);
/*
        isHidden(): возвращает истину, если каталог или файл является скрытым
        length(): возвращает размер файла в байтах
        lastModified(): возвращает время последнего изменения файла или каталога
        list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        listFiles(): возвращает массив файлов и подкаталогов, которые находятся
        в определенном каталоге
        mkdir(): создает новый каталог
        renameTo(File dest): переименовывает файл или каталог
        length(): возвращает размер файла в байтах
        lastModified(): возвращает время последнего изменения
        файла или каталога
        list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        listFiles(): возвращает массив файлов и подкаталогов, которые
        находятся в определенном каталоге
        mkdir(): создает новый каталог
        renameTo(File dest): переименовывает файл или каталог
*/
//        Пример получения абсолютного пути к файлу на другой платформе Win, IOS (файловой системе)

//        String pathProject = System.getProperty ("user.dir" );
//        String pathFile = pathProject .concat("/file.txt" );
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath ());  // D:\JavaCourse\file.txt

        // РАБОТА С ОШИБКАМИ
        /*
        try {
            Код, в котором может появиться ошибка
        } catch (Exception e) {
            Обработка, если ошибка случилась
        }
        finally {
            Код, который выполнится в любом случае
        }  */
/*
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        { System.out.println("finally"); }*/

// ИНОГДА ЛУЧШЕ ЗАМЕНЯТЬ try catch проверками:
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {          // Проверяем, что файл создан - вариант заменяющий  try catch
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

    //        РАБОТА С ПАПКАМИ - как с файлами
//        Пример:
        String pathProject = System.getProperty ("user.dir" );
        String pathDir = pathProject .concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath ());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }


    }
}














