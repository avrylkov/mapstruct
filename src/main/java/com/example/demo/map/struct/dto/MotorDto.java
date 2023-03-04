package com.example.demo.map.struct.dto;

import lombok.Data;
import org.apache.commons.lang3.tuple.Pair;

@Data
public class MotorDto {

   private Pair<Float, Integer> motorPair;
   private Float power;
   private Integer cylinders;

}
