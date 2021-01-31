package de.meyer.automobile.rest.model.builder;

import de.meyer.automobile.rest.model.Fueltype;
import de.meyer.automobile.rest.model.GearType;
import de.meyer.automobile.rest.model.Vehicle;
import java.io.File;
import java.time.LocalDate;

public class VehicleBuilder {

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
  

  public VehicleBuilder manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  public VehicleBuilder model(String model) {
    this.model = model;
    return this;
  }

  public VehicleBuilder mileage(int mileage) {
    this.mileage = mileage;
    return this;
  }

  public VehicleBuilder price(int price) {
    this.price = price;
    return this;
  }

  public VehicleBuilder firstRegistration(LocalDate firstRegistration) {
    this.firstRegistration = firstRegistration;
    return this;
  }

  public VehicleBuilder powerInKW(int powerInKW) {
    this.powerInKW = powerInKW;
    return this;
  }

  public VehicleBuilder powerInPS(int powerInPS) {
    this.powerInPS = powerInPS;
    return this;
  }

  public VehicleBuilder fueltype(Fueltype fueltype) {
    this.fueltype = fueltype;
    return this;
  }

  public VehicleBuilder gearType(GearType gearType) {
    this.gearType = gearType;
    return this;
  }

  public VehicleBuilder numberOfVehicleHolders(int numberOfVehicleHolders) {
    this.numberOfVehicleHolders = numberOfVehicleHolders;
    return this;
  }

  public VehicleBuilder nextTechnicalExamination(LocalDate nextTechnicalExamination) {
    this.nextTechnicalExamination = nextTechnicalExamination;
    return this;
  }

  public VehicleBuilder consumptionPerHundredKilometer(double consumptionPerHundredKilometer) {
    this.consumptionPerHundredKilometer = consumptionPerHundredKilometer;
    return this;
  }

  public VehicleBuilder environmentalBadge(String environmentalBadge) {
    this.environmentalBadge = environmentalBadge;
    return this;
  }

  public VehicleBuilder images(File images) {
    this.images = images;
    return this;
  }

  public VehicleBuilder uploadDate(LocalDate uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

  public Vehicle build()
  {
        if(manufacturer == null){
          throw new IllegalStateException("Missing manufacturer");
        }

      manufacturer = manufacturer;
      return new Vehicle(this);
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getModel() {
    return model;
  }

  public int getMileage() {
    return mileage;
  }

  public int getPrice() {
    return price;
  }

  public LocalDate getFirstRegistration() {
    return firstRegistration;
  }

  public int getPowerInKW() {
    return powerInKW;
  }

  public int getPowerInPS() {
    return powerInPS;
  }

  public Fueltype getFueltype() {
    return fueltype;
  }

  public GearType getGearType() {
    return gearType;
  }

  public int getNumberOfVehicleHolders() {
    return numberOfVehicleHolders;
  }

  public LocalDate getNextTechnicalExamination() {
    return nextTechnicalExamination;
  }

  public double getConsumptionPerHundredKilometer() {
    return consumptionPerHundredKilometer;
  }

  public String getEnvironmentalBadge() {
    return environmentalBadge;
  }

  public File getImages() {
    return images;
  }

  public LocalDate getUploadDate() {
    return uploadDate;
  }
}
