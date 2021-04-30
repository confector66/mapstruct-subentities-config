package com.emsk.mapstructsubentitiesconfig.entity;

import java.time.LocalDate;

public class MyNestedEntity implements Entity {

    private String name;
    private LocalDate creationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
