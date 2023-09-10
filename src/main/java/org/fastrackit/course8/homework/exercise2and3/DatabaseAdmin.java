package org.fastrackit.course8.homework.exercise2and3;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(LocalDateTime dateOfEmployment, String position, String firstName, String lastName,
                         LocalDateTime birthday, String address, String dbTechnology) {
        super(dateOfEmployment, position, firstName, lastName, birthday, address);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    public String getAddress() {
        return "db admin: " + super.getAddress();
    }
}
