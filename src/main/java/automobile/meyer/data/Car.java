package automobile.meyer.data;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import java.io.File;
import javax.persistence.Entity;

@Entity
public class Car extends PanacheEntity {

  public String hersteller;
  public String modell;
  public int laufleistung;
  public String kurzBeschreibung;
  public int herstellungsmonat;
  public int herstellungsjahr;
  public int kw;
  public int ps;
  public boolean gebraucht;
  public int fahrzeughalter;
  public String getriebeArt;
  public String kraftstoff;
  public double verbrauch;
  public double emissionen;
  public File autoBilder;

  public Car() {
  }


}
