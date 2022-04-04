package com.letscode.estudoendpoint.service;

import com.letscode.estudoendpoint.dto.CarRequest;
import com.letscode.estudoendpoint.model.Car;

public interface CarService {
  Car create(CarRequest carRequest);
}
