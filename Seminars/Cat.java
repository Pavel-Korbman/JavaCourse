package Seminars;

import java.util.Objects;

public class Cat {
    private String name; // private - доступны только в пределах класса Cat
    private String gender;
    private String breed;
    private String owner;
    private int year_of_birth;

    @Override
    public String toString() {   // Метод для вывода полей. Автозаполнение сочетанием клавиш Alt + Ins
        return "Cat{" +
                "имя='" + name + '\'' +
                ", пол='" + gender + '\'' +
                ", порода='" + breed + '\'' +
                ", хозяин='" + owner + '\'' +
                ", год рождения='" + year_of_birth + '\'' +
                '}';
    }

    public Cat(String name, String gender, String breed, String owner, int year_of_birth) {
        // Конструктор - запрещает незаполненные поля (название как класс)
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.owner = owner;
        this.year_of_birth = year_of_birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return year_of_birth == cat.year_of_birth && Objects.equals(name, cat.name) && Objects.equals(gender, cat.gender) && Objects.equals(breed, cat.breed) && Objects.equals(owner, cat.owner);
    }

    //    @Override
//    public int hashCode() {
//        return Objects.hash(name, gender, breed, owner, year_of_birth);
//    }
    @Override
    public int hashCode() {
        return name.hashCode() + gender.hashCode() + breed.hashCode() + owner.hashCode() + year_of_birth;
        // Составляем хэш код из целых чисел

    }
}
