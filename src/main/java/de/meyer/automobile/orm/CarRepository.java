package de.meyer.automobile.orm;

import de.meyer.automobile.rest.model.Car;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarRepository implements PanacheRepository<Car> {

  public List<Car> findAllCars() {
    return findAll().list();
  }


}
