package org.acme.aviation;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPAGNIES_AERIENNES")
public class Compagnie {

    @Id
    @Column(name = "ID_COMPAGNIE")
    public String idCompagnie;

    @Column(name = "NOM")
    public String nom;
}