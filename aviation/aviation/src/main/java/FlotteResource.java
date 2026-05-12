package org.acme.aviation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/flotte")
@Produces(MediaType.APPLICATION_JSON)
public class FlotteResource {

    @GET
    public List<String> getFlotte() {
        return List.of(
            "Air France - A320 x10",
            "Emirates - B777 x5"
        );
    }
}