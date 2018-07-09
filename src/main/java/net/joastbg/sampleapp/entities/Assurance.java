package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table( name= "ASSURANCE")
public class Assurance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int numero_assurance;
    
    @Column
    private String date_souscription;
    
    @Column
    private String date_anniversaire;
    
    @Column
    private String date_prelevement;
    
    @OneToMany
    private Echeances echeance;
    
    @ManyToOne
    private Client client;

    public int getNumero_assurance() {
        return numero_assurance;
    }

    public void setNumero_assurance(int numero_assurance) {
        this.numero_assurance = numero_assurance;
    }

    public String getDate_souscription() {
        return date_souscription;
    }

    public void setDate_souscription(String date_souscription) {
        this.date_souscription = date_souscription;
    }

    public String getDate_anniversaire() {
        return date_anniversaire;
    }

    public void setDate_anniversaire(String date_anniversaire) {
        this.date_anniversaire = date_anniversaire;
    }

    public String getDate_prelevement() {
        return date_prelevement;
    }

    public void setDate_prelevement(String date_prelevement) {
        this.date_prelevement = date_prelevement;
    }

    public Echeances getEcheance() {
        return echeance;
    }

    public void setEcheance(Echeances echeance) {
        this.echeance = echeance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
    
    
}
