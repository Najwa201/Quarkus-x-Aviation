package org.acme.aviation;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "FLOTTES_PASSAGERS")
public class Flotte extends PanacheEntity {

    public String idCompagnie;
    public String idAL;
    public int nombre;
}