package com.letscode.estudoendpoint.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ValidationError {
  private String field;
  private String message;
}
