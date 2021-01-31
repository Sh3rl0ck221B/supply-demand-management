package de.meyer.automobile.rest.resource;


import de.meyer.automobile.rest.model.Vehicle;
import de.meyer.automobile.rest.service.VehicleService;
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
public class VehicleResource {

    @Inject
    VehicleService vehicleService;

    @Path("hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String showCar(){
        return "auto";
    }

    @Path("/car/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Vehicle showCar(@PathParam("id") Long id){
        return vehicleService.showCar(id);
    }

    @Path("/cars")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Vehicle> showCarList(){
        return vehicleService.showCarList();
    }

    @Path("/car")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Vehicle addCar(Vehicle vehicle){
        return vehicleService.addCar(vehicle);
    }

    @Path("car/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Vehicle updateCar(@PathParam("id") Integer id, Vehicle vehicle){
        return vehicleService.updateCar(id, vehicle);
    }

    @Path("car/{id}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public boolean deleteCar(@PathParam("id") Integer id){
        return vehicleService.deleteCar(id);
    }




}