package com.letscode.estudoendpoint.service;

import com.letscode.estudoendpoint.dto.CarRequest;
import com.letscode.estudoendpoint.dto.CarResponse;

public interface CarService {
  CarResponse create(CarRequest carRequest);
}
