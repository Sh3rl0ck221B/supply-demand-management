package de.meyer.automobile.rest.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import java.io.File;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String manufacturer;
  String model;
  int mileage;
  int price;
  LocalDate firstRegistration;
  int powerInKW;
  int powerInPS;
  Fueltype fueltype;
  GearType gearType;
  int numberOfVehicleHolders;
  LocalDate nextTechnicalExamination;
  double consumptionPerHundredKilometer;
  String environmentalBadge;
  File images;
  LocalDate uploadDate;


  public Car() {
  }
}
