package com.letscode.estudoendpoint.dto;

import com.letscode.estudoendpoint.model.Car;

public class CarMapper {

  private CarMapper() { }

  public static Car toCar(CarRequest carRequest) {
    return Car.builder()
        .type(carRequest.getType())
        .door(carRequest.getDoor())
        .color(carRequest.getColor())
        .build();
  }

  public static CarResponse toCarResponse(Car car) {
    return CarResponse.builder()
        .id(car.getId())
        .type(car.getType())
        .door(car.getDoor())
        .color(car.getColor())
        .build();
  }
}
