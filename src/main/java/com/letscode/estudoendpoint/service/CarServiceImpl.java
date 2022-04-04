package com.letscode.estudoendpoint.service;



import com.letscode.estudoendpoint.dto.CarMapper;
import com.letscode.estudoendpoint.dto.CarRequest;
import com.letscode.estudoendpoint.model.Car;
import com.letscode.estudoendpoint.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

  @Autowired
  CarRepository carRepository;

  @Override
  public Car create(CarRequest carRequest) {
    return carRepository.save(CarMapper.toCar(carRequest));
  }
}
