package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иванов Иван Иванович", "Директор", "zxc@mail.ru", "+7(123)4567899", 100000.00, 50);
        employee.info();

        Employee[] persArray = new Employee[5];
        persArray[0] = employee;
        persArray[1] = new Employee("Иванов Иван Иванович", "Инженер", "iii@mail.ru", "+7(123)4567900", 30000.00, 30);
        persArray[2] = new Employee("Петров Петр Петрович", "Зам. директора", "ppp@mail.ru", "+7(123)4567901", 90000.00, 40);
        persArray[3] = new Employee("Петров Петр Петрович", "Зам. Инженера", "pppz@mail.ru", "+7(123)4567902", 20000.00, 20);
        persArray[4] = new Employee("Сидоров Сидор Сидорович", "Дворник", "sss@mail.ru", "+7(123)4567903", 19000.00,
                60);

        persArray[3].info();
    }


}
