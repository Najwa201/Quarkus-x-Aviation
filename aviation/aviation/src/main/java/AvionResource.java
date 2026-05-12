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
    public List<String> getAvions() {
        return List.of("A320 Airbus", "B777 Boeing", "A380 Airbus");
    }
}