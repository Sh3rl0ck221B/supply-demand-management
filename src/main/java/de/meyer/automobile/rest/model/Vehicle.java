package de.meyer.automobile.rest.model;

import de.meyer.automobile.rest.model.builder.VehicleBuilder;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import java.io.File;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle extends PanacheEntityBase {

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


  public Vehicle() {
  }

  public Vehicle(VehicleBuilder builder) {
    this.manufacturer = builder.getManufacturer();
    this.model = builder.getModel();
    this.mileage = builder.getMileage();
    this.price = builder.getPrice();
    this.firstRegistration = builder.getFirstRegistration();
    this.powerInKW = builder.getPowerInKW();
    this.powerInPS = builder.getPowerInPS();
    this.fueltype = builder.getFueltype();
    this.gearType = builder.getGearType();
    this.numberOfVehicleHolders = builder.getNumberOfVehicleHolders();
    this.nextTechnicalExamination = builder.getNextTechnicalExamination();
    this.consumptionPerHundredKilometer = builder.getConsumptionPerHundredKilometer();
    this.environmentalBadge = builder.getEnvironmentalBadge();
    this.images = builder.getImages();
    this.uploadDate = builder.getUploadDate();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getMileage() {
    return mileage;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public LocalDate getFirstRegistration() {
    return firstRegistration;
  }

  public void setFirstRegistration(LocalDate firstRegistration) {
    this.firstRegistration = firstRegistration;
  }

  public int getPowerInKW() {
    return powerInKW;
  }

  public void setPowerInKW(int powerInKW) {
    this.powerInKW = powerInKW;
  }

  public int getPowerInPS() {
    return powerInPS;
  }

  public void setPowerInPS(int powerInPS) {
    this.powerInPS = powerInPS;
  }

  public Fueltype getFueltype() {
    return fueltype;
  }

  public void setFueltype(Fueltype fueltype) {
    this.fueltype = fueltype;
  }

  public GearType getGearType() {
    return gearType;
  }

  public void setGearType(GearType gearType) {
    this.gearType = gearType;
  }

  public int getNumberOfVehicleHolders() {
    return numberOfVehicleHolders;
  }

  public void setNumberOfVehicleHolders(int numberOfVehicleHolders) {
    this.numberOfVehicleHolders = numberOfVehicleHolders;
  }

  public LocalDate getNextTechnicalExamination() {
    return nextTechnicalExamination;
  }

  public void setNextTechnicalExamination(LocalDate nextTechnicalExamination) {
    this.nextTechnicalExamination = nextTechnicalExamination;
  }

  public double getConsumptionPerHundredKilometer() {
    return consumptionPerHundredKilometer;
  }

  public void setConsumptionPerHundredKilometer(double consumptionPerHundredKilometer) {
    this.consumptionPerHundredKilometer = consumptionPerHundredKilometer;
  }

  public String getEnvironmentalBadge() {
    return environmentalBadge;
  }

  public void setEnvironmentalBadge(String environmentalBadge) {
    this.environmentalBadge = environmentalBadge;
  }

  public File getImages() {
    return images;
  }

  public void setImages(File images) {
    this.images = images;
  }

  public LocalDate getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(LocalDate uploadDate) {
    this.uploadDate = uploadDate;
  }
}
