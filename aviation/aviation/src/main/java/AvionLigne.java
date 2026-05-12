package org.acme.aviation;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class AvionLigne extends PanacheEntity {

    public String idAl;
    public String constructeur;
    public String modele;
}