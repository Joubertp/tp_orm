package net.joastbg.sampleapp.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name= "ASSURANCE_AUTO")
public class AssuranceAuto extends Assurance{
    
    @Id
    @OneToOne
    @JoinColumn(name = "ASSURANCE", referencedColumnName = "numero_assurance")
    private Assurance asurrane;
    
    @Column
    private String immatriculation;
    
    @Column
    private List<String> bonus_malus;    


    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public List<String> getBonus_malus() {
        return bonus_malus;
    }

    public void setBonus_malus(List<String> bonus_malus) {
        this.bonus_malus = bonus_malus;
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
