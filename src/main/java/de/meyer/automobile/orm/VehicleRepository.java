package de.meyer.automobile.orm;

import de.meyer.automobile.rest.model.Vehicle;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehicleRepository implements PanacheRepository<Vehicle> {

  public List<Vehicle> findAllCars() {
    return findAll().list();
  }


}
