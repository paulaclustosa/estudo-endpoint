package com.letscode.estudoendpoint.dto;

import lombok.Builder;

@Builder
public class CarResponse {
  private Integer id;
  private String type;
  private Integer door;
  private String color;
}
