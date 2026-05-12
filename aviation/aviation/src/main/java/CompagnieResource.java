package org.acme.aviation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/compagnies")
@Produces(MediaType.APPLICATION_JSON)
public class CompagnieResource {

    @GET
    public List<String> get() {
        return List.of("Air France", "Emirates");
    }
}