package org.acme.aviation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/avions")
@Produces(MediaType.APPLICATION_JSON)
public class AvionResource {

    @GET
    public List<Avion> get() {
        return Avion.listAll();
    }
}
@GET
@Path("/count")
public long count() {
    return Avion.count();
}