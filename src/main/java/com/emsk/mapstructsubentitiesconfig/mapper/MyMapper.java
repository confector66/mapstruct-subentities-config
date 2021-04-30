package com.emsk.mapstructsubentitiesconfig.mapper;

import org.mapstruct.Mapper;

import com.emsk.mapstructsubentitiesconfig.dto.MyDto;
import com.emsk.mapstructsubentitiesconfig.entity.MyEntity;

@Mapper(config = MyMapperConfig.class)
public interface MyMapper {

    MyEntity map(MyDto myDto);
}
