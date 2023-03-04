package com.example.demo.map.struct.mapper;

import com.example.demo.map.struct.dto.CarDto;
import com.example.demo.map.struct.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {MotorMap2.class, PersonMapper2.class, IdClassMapper.class})
public abstract class CarMapper2 {

    public static CarMapper2 INSTANCE = Mappers.getMapper( CarMapper2.class );

    @Mapping(source = "numberOfSeats", target = "seatCount")
    @Mapping(source = "idClass", target = "id")
    public abstract CarDto carToCarDto(Car car);
}
