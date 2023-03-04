package com.example.demo.map.struct.mapper;

import com.example.demo.map.struct.dto.MotorDto;
import com.example.demo.map.struct.model.Motor;
import org.apache.commons.lang3.tuple.Pair;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(uses = {PowerMap2.class})
public abstract class MotorMap2 {

    @Mapping(source = "numberCylinders", target = "cylinders")
    @Mapping(target = "power", source = "power", qualifiedByName = {"PowerMap_2", "toWatt"})
    @Mapping(target = "motorPair", source = "motor")
    public abstract MotorDto motorMap(Motor motor);

    protected Pair<Float, Integer> toMotorPair(Motor motor) {
        return Pair.of(motor.getPower(), motor.getNumberCylinders());
    }

    @AfterMapping
    protected void update(Motor motor, @MappingTarget MotorDto motorDto) {
        //motorDto.
    }

}
