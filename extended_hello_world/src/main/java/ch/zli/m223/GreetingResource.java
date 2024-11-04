package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    public String addNumbers(@QueryParam("num1") int num1, @QueryParam("num2") int num2) {
        int1 + int2
        return "Hello from Quarkus REST";
    }
}
