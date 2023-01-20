package com.carsapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarDTO;
import com.carsapi.api.model.Car;
import com.carsapi.api.repository.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {
  @Autowired
  private CarRepository carRepository;

  @PostMapping()
  public void receiveCar(@RequestBody CarDTO reqBody) {
    carRepository.save(new Car(reqBody));
  }

  @GetMapping()
  public List<Car> listAll() {
    return carRepository.findAll();
  }

  @DeleteMapping("/{id}")
  public void deleteCar(@PathVariable Long id) {
    carRepository.deleteById(id);
  }
}
