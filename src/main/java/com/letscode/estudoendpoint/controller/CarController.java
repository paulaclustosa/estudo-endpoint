package com.letscode.estudoendpoint.controller;

import com.letscode.estudoendpoint.dto.CarRequest;
import com.letscode.estudoendpoint.dto.CarResponse;
import com.letscode.estudoendpoint.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/car")
public class CarController {

  CarService carService;

  @Autowired
  public CarController(CarService carService) {
    this.carService = carService;
  }

  @PostMapping
  public ResponseEntity<CarResponse> create(
      @RequestBody @Valid CarRequest carRequest,
      UriComponentsBuilder uriComponentBuilder) {
    CarResponse car = carService.create(carRequest);
    URI uri = uriComponentBuilder.path("/car/{id}").buildAndExpand(car.getId()).toUri();
    return ResponseEntity.created(uri).body(car);
  }

}
