package OOP;

import java.util.Scanner;

public class main {

    public static void printAdults(Student[] students) {
        System.out.println("Пользователи старше 18 лет:\n");
        for (Student student : students) {
            if (student.getAge() > 18) {
                student.displayInfo();
            }
        }
    }

    public static void main(String[] args) {

        // Создаем массив для хранения объектов класса Student
        Student[] students = new Student[10];

        // Заполняем массив объектами Student
        students[0] = new Student("Иван Иванов", "ул. Ленина, д. 1", 16, 1234567890L, 10, "ivanov@example.com");
        students[1] = new Student("Петр Петров", "ул. Гагарина, д. 5", 17, 2345678901L, 11, "petrov@example.com");
        students[2] = new Student("Анна Смирнова", "ул. Кировская, д. 10", 20, 3456789012L, 9, "smirnova@example.com");
        students[3] = new Student("Мария Кузнецова", "ул. Чапаева, д. 8", 16, 4567890123L, 10, "kuznetsova@example.com");
        students[4] = new Student("Сергей Лебедев", "ул. Пушкина, д. 12", 19, 5678901234L, 12, "lebedev@example.com");
        students[5] = new Student("Ольга Попова", "ул. Мира, д. 15", 17, 6789012345L, 11, "popova@example.com");
        students[6] = new Student("Николай Волков", "ул. Лесная, д. 9", 19, 7890123456L, 9, "volkov@example.com");
        students[7] = new Student("Елена Сидорова", "ул. Октябрьская, д. 4", 16, 8901234567L, 10, "sidorova@example.com");
        students[8] = new Student("Алексей Новиков", "ул. Комсомольская, д. 3", 21, 9012345678L, 12, "novikov@example.com");
        students[9] = new Student("Татьяна Ковалева", "ул. Молодежная, д. 7", 17, 9123456789L, 11, "kovaleva@example.com");

        // Выводим информацию о всех студентах

        Scanner scanner = new Scanner(System.in);
        System.out.print("Вывести всех студентов(all) или совершинолшетних(adults)?");
        String input = scanner.nextLine();
        if (input.equals("all")) {
            for (Student student : students) {
                student.displayInfo();
            }
        } else {
            printAdults(students);
        }
    }
}
