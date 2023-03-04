package com.example.demo.map.struct.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
//@SuperBuilder
//@Getter
public class CarDto extends BaseDto {

    private String make;
    private Integer yearOfIssue;
    private Integer seatCount;
    private String type;
    private MotorDto motor;
    private List<PersonDto> persons;

}
