package com.letscode.estudoendpoint.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car")
@Getter @Setter
@NoArgsConstructor
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column
  private Type type;
  @Column
  private Integer door;
  @Column
  private String color;

  @Builder
  public Car(String type, Integer door, String color) {
    this.type = Enum.valueOf(Type.class, type);
    this.door = door;
    this.color = color;
  }
}
