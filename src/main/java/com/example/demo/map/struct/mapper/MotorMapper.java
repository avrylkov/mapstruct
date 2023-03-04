package com.example.demo.map.struct.mapper;

import org.mapstruct.Mapping;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Mapping(source = "motor.numberCylinders", target = "motor.cylinders")
public @interface MotorMapper {


}
