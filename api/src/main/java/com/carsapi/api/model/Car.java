package com.carsapi.api.model;

import com.carsapi.api.dto.CarDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

  public Car(CarDTO carDTO) {
    this.modelo = carDTO.modelo();
    this.fabricante = carDTO.fabricante();
    this.dataFabricacao = carDTO.dataFabricacao();
    this.valor = carDTO.valor();
    this.anoModelo = carDTO.anoModelo();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String modelo;

  private String fabricante;

  private String dataFabricacao;

  private Integer valor;

  private String anoModelo;
}
