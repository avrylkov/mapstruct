package com.example.demo.map.struct.model;

import lombok.Data;

import java.util.List;

@Data
public class Car extends Base {

    private final String make;
    private final Integer yearOfIssue;
    private final Integer numberOfSeats;
    private final CarTypeEnum type;
    private final Motor motor;
    private List<Person> persons;

}
