package com.example.demo.map.struct.mapper;

import org.mapstruct.Named;

@Named("PowerMap_2")
public class PowerMap2 {

    @Named("toWatt")
    public Float toWatt(Float value) {
        return value * 1.36f;
    }

    @Named("toHorse")
    public Float toHorse(Float value) {
        return value * 0.74f;
    }


}
