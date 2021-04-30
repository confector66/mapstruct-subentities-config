package com.emsk.mapstructsubentitiesconfig.entity;

import java.time.LocalDate;

public class MyEntity implements Entity {

    private MyNestedEntity myNestedDto;
    private LocalDate creationDate;

    public MyNestedEntity getMyNestedDto() {
        return myNestedDto;
    }

    public void setMyNestedDto(MyNestedEntity myNestedDto) {
        this.myNestedDto = myNestedDto;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
