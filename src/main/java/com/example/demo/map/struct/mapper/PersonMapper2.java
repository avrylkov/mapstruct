package com.example.demo.map.struct.mapper;

import com.example.demo.map.struct.dto.PersonDto;
import com.example.demo.map.struct.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class PersonMapper2 {

    @Mapping(source = "name", target = "personName")
    //@Mapping(target = "withPersonName", ignore = true)
    public abstract PersonDto personToDto(Person person);

}
