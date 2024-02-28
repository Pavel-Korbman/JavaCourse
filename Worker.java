// Класс работников предприятия
import java.util.*;
public class Worker {
    // Поля класса (данные)
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {  // Метод для вывода работников в формате "id:%s, Имя:%s, Фамилия:%s, Зарплата:%d"
        String res = String.format("id:%s, Имя:%s, Фамилия:%s, Зарплата:%d", id, firstName, lastName, salary);
        return res;
    }

    @Override
    public boolean equals(Object o) {  // Метод определяет, что работники с одинаковыми id и firstName - равны
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {  // Метод задаёт Хэш Код равный id
        return id;
    }


}
