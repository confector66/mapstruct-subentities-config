package com.emsk.mapstructsubentitiesconfig.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.ReportingPolicy;

import com.emsk.mapstructsubentitiesconfig.dto.MyDto;
import com.emsk.mapstructsubentitiesconfig.entity.MyEntity;

@MapperConfig(
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG)
public interface MyMapperConfig {

    @Mapping(target = "creationDate", ignore = true)
    MyEntity mapMyEntity(MyDto source);
}
