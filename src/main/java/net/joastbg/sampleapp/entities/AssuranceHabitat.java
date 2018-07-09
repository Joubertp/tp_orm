package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name= "ASSURANCE_HABITATION")
public class AssuranceHabitat extends Assurance{
    
    @Id
    @OneToOne
    @JoinColumn(name = "ASSURANCE", referencedColumnName = "numero_assurance")
    private Assurance asurrane;
    
    @Column
    private String adresse_assuree;
    
    @Column
    private int valeur_couverture;

    public Assurance getAsurrane() {
        return asurrane;
    }

    public void setAsurrane(Assurance asurrane) {
        this.asurrane = asurrane;
    }

    public String getAdresse_assuree() {
        return adresse_assuree;
    }

    public void setAdresse_assuree(String adresse_assuree) {
        this.adresse_assuree = adresse_assuree;
    }

    public int getValeur_couverture() {
        return valeur_couverture;
    }

    public void setValeur_couverture(int valeur_couverture) {
        this.valeur_couverture = valeur_couverture;
    }
    
    @Override
    public int getNumero_assurance() {
        return asurrane.getNumero_assurance();
    }

    @Override
    public void setNumero_assurance(int numero_assurance) {
        this.asurrane.setNumero_assurance(numero_assurance);
    }

    @Override
    public String getDate_souscription() {
        return asurrane.getDate_souscription();
    }

    @Override
    public void setDate_souscription(String date_souscription) {
        this.asurrane.setDate_souscription(date_souscription);
    }

    @Override
    public String getDate_anniversaire() {
        return asurrane.getDate_anniversaire();
    }

    @Override
    public void setDate_anniversaire(String date_anniversaire) {
        this.asurrane.setDate_anniversaire(date_anniversaire);
    }

    @Override
    public String getDate_prelevement() {
        return asurrane.getDate_prelevement();
    }

    @Override
    public void setDate_prelevement(String date_prelevement) {
        this.asurrane.setDate_prelevement(date_prelevement);
    }

    @Override
    public Echeances getEcheance() {
        return asurrane.getEcheance();
    }

    @Override
    public void setEcheance(Echeances echeance) {
        this.asurrane.setEcheance(echeance);
    }

    @Override
    public Client getClient() {
        return asurrane.getClient();
    }

    @Override
    public void setClient(Client client) {
        this.asurrane.setClient(client);
    }
    
    
    
}
