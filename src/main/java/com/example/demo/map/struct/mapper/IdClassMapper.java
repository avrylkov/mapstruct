package com.example.demo.map.struct.mapper;

import com.example.demo.map.struct.model.IdClass;
import org.mapstruct.Mapper;

@Mapper
public abstract class IdClassMapper {

    public Integer convert(IdClass idClass) {
        return idClass.getId();
    }

}
