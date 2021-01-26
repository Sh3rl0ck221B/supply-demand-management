package de.meyer.automobile.rest.resource;


import de.meyer.automobile.rest.model.Car;
import de.meyer.automobile.orm.CarRepository;
import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/am")
public class CarResource {

    @Inject
    CarRepository carRepository;

    @Path("hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String showCar(){
        return "auto";
    }

    @Path("/car/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Car showCar(@PathParam("id") Long id){
        return carRepository.findById(id);
    }

    @Path("/cars")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> showCarList(){
        return carRepository.findAllCars();
    }

    @Path("/car")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Car addCar(Car car){
        car.persist();
        return car;
    }

    @Path("car/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Car updateCar(@PathParam("id") Integer id, Car car){
        return car;
    }

    @Path("car/{id}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public boolean deleteCar(@PathParam("id") Integer id){
        carRepository.delete("id", id);
        return true;
    }




}