package org.acme.aviation;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class CompagnieAerienne extends PanacheEntity {

    public String idCompagnie;
    public String nom;
}