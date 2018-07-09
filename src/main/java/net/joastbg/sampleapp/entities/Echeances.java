package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name= "ECHEANCE")
public class Echeances {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_echeance")
    private int id_echeance;
    
    @Column
    private int prix;

    @Column
    private String date_emission;
    
    @Column
    private String date_paiment;
    
    @Column
    private String date_emission_facture;

    public int getId_echeance() {
        return id_echeance;
    }

    public void setId_echeance(int id_echeance) {
        this.id_echeance = id_echeance;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getDate_emission() {
        return date_emission;
    }

    public void setDate_emission(String date_emission) {
        this.date_emission = date_emission;
    }

    public String getDate_paiment() {
        return date_paiment;
    }

    public void setDate_paiment(String date_paiment) {
        this.date_paiment = date_paiment;
    }

    public String getDate_emission_facture() {
        return date_emission_facture;
    }

    public void setDate_emission_facture(String date_emission_facture) {
        this.date_emission_facture = date_emission_facture;
    }
    
    
    
}
