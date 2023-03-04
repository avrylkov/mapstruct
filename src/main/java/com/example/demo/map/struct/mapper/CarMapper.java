package com.example.demo.map.struct.mapper;

import com.example.demo.map.struct.dto.CarDto;
import com.example.demo.map.struct.dto.MotorDto;
import com.example.demo.map.struct.dto.PersonDto;
import com.example.demo.map.struct.model.Car;
import com.example.demo.map.struct.model.Motor;
import com.example.demo.map.struct.model.Person;
import com.example.demo.map.struct.model.PowerType;
import org.apache.commons.lang3.tuple.Pair;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper
// 5 way Motor
/*(uses = {MotorMap.class}) */
// 6 way
(uses = {PowerMap.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class CarMapper {

    public static CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "numberOfSeats", target = "seatCount")
    // 1 way Motor
    //@Mapping(source = "motor.numberCylinders", target = "motor.cylinders")
    // 2 way Motor
    //@MotorMapper
    // 6 way
    @Mapping(target = "motor.power", qualifiedBy = {PowerConverter.class, PowerToHorse.class})
    //@Mapping(target = "motor.motorPair", source = "motor")
    public abstract CarDto carToCarDto(Car car, @Context PowerType powerType);

    @Mapping(source = "name", target = "personName")
    //@Mapping(target = "withPersonName", ignore = true)
    public abstract PersonDto personToDto(Person person);

//    protected float convertPower(float power, @Context PowerType powerType) {
//        if (PowerType.WATT == powerType) {
//            return power * 0.7f;
//        }
//        return power;
//    }

//    protected float convertPower(float power) {
//            return power * 0.7f;
//    }

//    protected int convertYearOfIssue(int yearOfIssue) {
//        return yearOfIssue;
//    }

    // 3 way Motor
    //@Mapping(source = "numberCylinders", target = "cylinders")
    //protected abstract MotorDto motorToMotorDto(Motor motor);

//    4 way Motor
//    protected MotorDto motorToDto(Motor motor) {
//       MotorDto motorDto = new MotorDto();
//       motorDto.setPower(motor.getPower() + 1);
//       motorDto.setCylinders(motor.getNumberCylinders());
//       return motorDto;
//    }

}
