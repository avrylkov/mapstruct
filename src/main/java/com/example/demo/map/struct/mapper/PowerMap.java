package com.example.demo.map.struct.mapper;

@PowerConverter
public class PowerMap {

    @PowerToWatt
    public Float toWatt(Float value) {
        return value * 1.36f;
    }

    @PowerToHorse
    public Float toHorse(Float value) {
        return value * 0.74f;
    }


}
