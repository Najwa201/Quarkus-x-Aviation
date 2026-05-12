package org.acme.aviation;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class FlottePassager extends PanacheEntity {

    public String idCompagnie;
    public String idAl;
    public Integer nombre;
}