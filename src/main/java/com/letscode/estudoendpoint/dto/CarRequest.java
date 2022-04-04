package com.letscode.estudoendpoint.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
public class CarRequest {
  @NotEmpty @NotNull
  private String type;
  @NotEmpty @NotNull
  private Integer door;
  @NotEmpty @NotNull
  private String color;
}
