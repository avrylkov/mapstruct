package com.example.demo.map.struct.mapper;

import com.example.demo.map.struct.dto.MotorDto;
import com.example.demo.map.struct.model.Motor;

public class MotorMap {

    public MotorDto motorMap(Motor motor) {
       MotorDto motorDto = new MotorDto();
       motorDto.setPower(motor.getPower() + 12);
       motorDto.setCylinders(motor.getNumberCylinders());
       return motorDto;
    }


}
