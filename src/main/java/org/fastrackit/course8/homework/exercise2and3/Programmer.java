package org.fastrackit.course8.homework.exercise2and3;

import java.time.LocalDateTime;

public class Programmer extends Employee {
    private String language;

    public Programmer(LocalDateTime dateOfEmployment, String position, String firstName, String lastName,
                      LocalDateTime birthday, String address, String language) {
        super(dateOfEmployment, position, firstName, lastName, birthday, address);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String getPosition() {
        return "programmer";
    }
}
