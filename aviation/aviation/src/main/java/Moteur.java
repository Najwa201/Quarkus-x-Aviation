package org.acme.aviation;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "MOTEURS")
public class Moteur extends PanacheEntity {

    public String idMoteur;
    public String fabricant;
    public String famille;
    public double poussee;
}