package org.fastrackit.course8.homework.exercise2and3;

import java.time.LocalDateTime;

public class PersonMain {
    public static void main(String[] args) {
        Person employee = new Employee(LocalDateTime.of(2020,01,10,12,00),
                "carpenter", "Gheorghe", "Popa",
                LocalDateTime.of(1980,06,10,12,00), "Oradea");

        Person programmer = new Programmer(LocalDateTime.of(2021,06,10,12,00),
                "junior developer", "Vasile", "Pop",
                LocalDateTime.of(1989,05,31,12,00),
                "Cluj-Napoca", "Java");

        Person dbAdmin = new DatabaseAdmin(LocalDateTime.of(2020,06,10,12,00),
                "database admin", "Sorin", "Ardelean",
                LocalDateTime.of(1985,05,31,12,00),
                "Bucuresti", "SQL");

        System.out.println(employee.getFirstName() + " " + employee.getLastName());
        System.out.println(((Employee) employee).getPosition());
        System.out.println(employee.getAddress());
        System.out.println("**********************");
        System.out.println(programmer.getFirstName() + " " + programmer.getLastName());
        System.out.println(((Programmer) programmer).getPosition());
        System.out.println(programmer.getAddress());
        System.out.println("**********************");
        System.out.println(dbAdmin.getFirstName() + " " + dbAdmin.getLastName());
        System.out.println(((Employee)dbAdmin).getPosition());
        System.out.println(dbAdmin.getAddress());
        System.out.println("**********************");

        PersonReader[] persons = {new PersonReader(employee), new PersonReader(programmer), new PersonReader(dbAdmin)};
        for (PersonReader person : persons) {
            System.out.println(person.getFullName());
            System.out.println(person.getAge());
        }
    }
}
