package com.example.demo.map.struct.dto;

import lombok.Data;

@Data
public class PersonDto {

    private String personName;
    private String gender;
    private Integer age;
    //private Integer address;

    public PersonDto withPersonName(String personName) {
        this.personName = personName;
        return this;
    }

}
