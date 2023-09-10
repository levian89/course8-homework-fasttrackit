package org.fastrackit.course8.homework.exercise2and3;

import java.time.LocalDateTime;

public class Employee implements Person {

    private LocalDateTime dateOfEmployment;
    private String position;
    private String firstName;
    private String lastName;
    private LocalDateTime birthday;
    private String address;

    public Employee(LocalDateTime dateOfEmployment, String position, String firstName, String lastName,
                    LocalDateTime birthday, String address) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }
}
