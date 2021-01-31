package de.meyer.automobile.rest.service;

import de.meyer.automobile.orm.VehicleRepository;
import de.meyer.automobile.rest.model.Vehicle;
import de.meyer.automobile.rest.model.builder.VehicleBuilder;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class VehicleService {

  @Inject
  VehicleRepository vehicleRepository;

  public Vehicle showCar(Long id){
    return vehicleRepository.findById(id);
  }

  public List<Vehicle> showCarList(){
    return vehicleRepository.findAllCars();
  }

  public Vehicle addCar(Vehicle vehicle){
    Vehicle car = new VehicleBuilder().model(vehicle.getModel())
                                      .price(vehicle.getPrice())
                                      .manufacturer(vehicle.getManufacturer())
                                      .build();
    car.persist();
    return vehicle;
  }

  public Vehicle updateCar(Integer id, Vehicle vehicle) {
    return vehicle;
  }

  public boolean deleteCar(Integer id){
    vehicleRepository.delete("id", id);
    return true;
  }
}
