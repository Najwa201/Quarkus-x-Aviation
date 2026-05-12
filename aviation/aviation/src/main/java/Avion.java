package org.acme.aviation;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "AVIONS_LIGNE")
public class Avion extends PanacheEntity {

    public String idAL;
    public String idALFULL;
    public String constructeur;
    public String modele;
}