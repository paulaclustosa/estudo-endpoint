package com.letscode.estudoendpoint.dto;

import com.letscode.estudoendpoint.model.Type;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
public class CarRequest {
  @NotNull
  private Type type;
  @NotNull
  private Integer door;
  @NotEmpty @NotNull
  private String color;
}
