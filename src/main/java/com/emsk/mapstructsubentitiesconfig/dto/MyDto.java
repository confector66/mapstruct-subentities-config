package com.emsk.mapstructsubentitiesconfig.dto;

import java.time.LocalDate;

public class MyDto {

    private MyNestedDto myNestedDto;
    private LocalDate creationDate;

    public MyNestedDto getMyNestedDto() {
        return myNestedDto;
    }

    public void setMyNestedDto(MyNestedDto myNestedDto) {
        this.myNestedDto = myNestedDto;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
