package automobile.meyer.data;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class Car extends PanacheEntity {

  public String manufacturer;
  public String model;
  public int mileage;
  public int price;



}
