package com.emsk.mapstructsubentitiesconfig.mapper;

import static org.junit.Assert.assertNull;

import java.time.LocalDate;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.emsk.mapstructsubentitiesconfig.dto.MyDto;
import com.emsk.mapstructsubentitiesconfig.dto.MyNestedDto;
import com.emsk.mapstructsubentitiesconfig.entity.MyEntity;

public class MyMapperTest {

    @Test
    public void mapShouldIgnoreCreationTime() {

        // given
        MyMapper myMapper = Mappers.getMapper(MyMapper.class);

        LocalDate creationTime = LocalDate.of(2021, 3, 12);
        MyNestedDto myNestedDto = new MyNestedDto();
        myNestedDto.setCreationDate(creationTime);
        myNestedDto.setName("my name");

        MyDto myDto = new MyDto();
        myDto.setCreationDate(creationTime);
        myDto.setMyNestedDto(myNestedDto);

        // when
        MyEntity myEntity = myMapper.map(myDto);

        // then
        // creationDate is ignored due to MapperConfig
        assertNull(myEntity.getCreationDate());

        // MapperConfig is also valid for MyNestedDto, should be null
        assertNull(myEntity.getMyNestedDto().getCreationDate());
    }

}