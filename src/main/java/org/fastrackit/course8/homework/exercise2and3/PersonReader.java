package org.fastrackit.course8.homework.exercise2and3;

import java.time.Duration;
import java.time.LocalDateTime;

public class PersonReader {
    private Person person;

    public PersonReader(Person person) {
        this.person = person;
    }

    public String getFullName() {
        return "Full name: " + person.getFirstName() + " " + person.getLastName();
    }

    public String getAge() {
        LocalDateTime birthday = person.getBirthday();
        LocalDateTime now = LocalDateTime.now();
        Duration age = Duration.between(birthday,now);
        return "Age: " + age.toDays()/365 + " years";
    }
}
