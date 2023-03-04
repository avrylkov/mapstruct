package com.example.demo.map.struct;

import com.example.demo.map.struct.dto.CarDto;
import com.example.demo.map.struct.mapper.CarMapper;
import com.example.demo.map.struct.mapper.CarMapper2;
import com.example.demo.map.struct.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationMapperTests {

	@Test
	public void shouldMapCarToDto() {
		//given
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Alex", "Men", 52));
		Motor motor = new Motor(200.0f, 4);
		Car car = new Car("Morris", 2021, 5, CarTypeEnum.SEDAN, motor);
		car.setPersons(persons);

		//when
		CarDto carDto = CarMapper.INSTANCE.carToCarDto(car, PowerType.WATT);

		//then
		assertThat(carDto).isNotNull();
		assertThat(carDto.getMake()).isEqualTo("Morris");
		assertThat(carDto.getSeatCount()).isEqualTo(5);
		assertThat(carDto.getType()).isEqualTo("SEDAN");
	}

	@Test
	public void shouldMapCarToDto2() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Alex", "Men", 52));
		Motor motor = new Motor(150.0f, 4);
		Car car = new Car("Morris", 2021, 5, CarTypeEnum.SEDAN, motor);
		car.setIdClass(new IdClass(1));
		car.setPersons(persons);

		CarDto carDto = CarMapper2.INSTANCE.carToCarDto(car);

		assertThat(carDto).isNotNull();
		assertThat(carDto.getMake()).isEqualTo("Morris");
	}

}
