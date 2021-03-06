package at.fh.sve.ue4.ms.rest;

import at.fh.sve.ue4.ms.domain.Coordinates;
import at.fh.sve.ue4.ms.logic.ParkingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.microprofile.opentracing.Traced;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/parking")
@Api("parking")
@Traced
public class ParkingResource {

    @Inject
    private ParkingService parkingService;

    @GET
    @Path("coordinates/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "returns the coordinates for a specific city", response = Response.class, produces = MediaType.APPLICATION_JSON)
    public Response getCoordinateForCity(@PathParam("city") String city){
        return Response.ok(parkingService.readCoordinate(city)).build();
    }

    @POST
    @Path("coordinates")
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "creates the coordinates", response = Response.class, consumes = MediaType.APPLICATION_JSON)
    public Response createCoordinates(@NotNull @Valid Coordinates coordinates){
        parkingService.addCoordinates(coordinates);
        return Response.ok().build();
    }
}
