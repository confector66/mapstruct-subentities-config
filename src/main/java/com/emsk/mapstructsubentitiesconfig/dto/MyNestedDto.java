package com.emsk.mapstructsubentitiesconfig.dto;

import java.time.LocalDate;

public class MyNestedDto {

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
