package com.letscode.estudoendpoint.dto;

import com.letscode.estudoendpoint.model.Type;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CarResponse {
  private Integer id;
  private Type type;
  private Integer door;
  private String color;
}
