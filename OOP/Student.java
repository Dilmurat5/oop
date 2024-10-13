package OOP;

public class Student {
    private final String fio;
    private final String address;
    private final int age;
    private final long number;
    private final int whichClass;
    private final String email;

    public Student(String fio, String address, int age, long number, int whichClass, String email) {
        this.fio = fio;
        this.address = address;
        this.age = age;
        this.number = number;
        this.whichClass = whichClass;
        this.email = email;
    }

    // Геттеры и сеттеры
    public String getFio() {
        return fio;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public long getNumber() {
        return number;
    }

    public int getWhichClass() {
        return whichClass;
    }

    public String getEmail() {
        return email;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Адрес: " + address);
        System.out.println("Возраст: " + age);
        System.out.println("Номер телефона: " + number);
        System.out.println("Класс: " + whichClass);
        System.out.println("Email: " + email);
        System.out.println();}
}
