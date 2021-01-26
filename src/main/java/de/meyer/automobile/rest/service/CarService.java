package de.meyer.automobile.rest.service;

import de.meyer.automobile.orm.CarRepository;
import de.meyer.automobile.rest.model.Car;
import java.util.List;
import javax.inject.Inject;

public class CarService {

  @Inject
  CarRepository carRepository;

  public Car showCar(Long id){
    return carRepository.findById(id);
  }

  public List<Car> showCarList(){
    return carRepository.findAllCars();
  }


  public Car addCar(Car car){
    car.persist();
    return car;
  }

  public Car updateCar(Integer id, Car car){
    return car;
  }

  public boolean deleteCar(Integer id){
    carRepository.delete("id", id);
    return true;
  }
}
