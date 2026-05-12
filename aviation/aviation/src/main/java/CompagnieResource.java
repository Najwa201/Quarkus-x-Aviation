package org.acme.aviation;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/compagnies")
@Produces(MediaType.APPLICATION_JSON)
public class CompagnieResource {

    @Inject
    EntityManager em;

    @GET
    public List<Compagnie> getAll() {
        return em.createQuery("SELECT c FROM Compagnie c", Compagnie.class)
                .getResultList();
    }
}