package com.carsapi.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarDTO;

@RestController
@RequestMapping("/cars")
public class CarController {
  @PostMapping()
  public void receiveCar(@RequestBody CarDTO reqBody) {
    System.out.println(reqBody.modelo());
    System.out.println(reqBody.fabricante());
    System.out.println(reqBody.valor());

  }
}
