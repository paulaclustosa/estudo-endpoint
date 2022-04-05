package com.letscode.estudoendpoint.model;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "car")
@Builder
@Getter @Setter
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column
  @Enumerated(EnumType.STRING)
  private Type type;
  @Column
  private Integer door;
  @Column
  private String color;

}
