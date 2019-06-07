package at.fh.sve.ue04.ms.rest;

import at.fh.sve.ue04.ms.domain.ParkingSpace;
import at.fh.sve.ue04.ms.service.ParkingService;
import org.eclipse.microprofile.opentracing.Traced;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.NoSuchElementException;

@Path("/parking")
@Traced
public class ParkingResource {

    @Inject
    private ParkingService parkingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllParkingSpaces() {
        return Response.ok(parkingService.getAllParkingSpaces()).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getParkingSpace(@PathParam("id") Long id) {
        try {
            return Response.ok(parkingService.getParkingSpace(id)).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        } catch (NoSuchElementException e) {
            return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addParkingSpace(ParkingSpace ps) {
        return Response.ok(parkingService.addParkingSpace(ps)).build();
    }

}
