package com.letscode.estudoendpoint.service;



import com.letscode.estudoendpoint.dto.CarMapper;
import com.letscode.estudoendpoint.dto.CarRequest;
import com.letscode.estudoendpoint.dto.CarResponse;
import com.letscode.estudoendpoint.model.Car;
import com.letscode.estudoendpoint.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

  CarRepository carRepository;

  @Autowired
  public CarServiceImpl(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  @Override
  public CarResponse create(CarRequest carRequest) {
    Car car = CarMapper.toCar(carRequest);
    return CarMapper.toCarResponse(carRepository.save(car));
  }
}
