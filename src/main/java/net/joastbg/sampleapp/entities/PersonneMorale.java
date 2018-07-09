package net.joastbg.sampleapp.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name= "PERSONNE_MORALE")
public class PersonneMorale extends Client{
    
    @Id
    @OneToOne
    @JoinColumn(name = "CLIENT", referencedColumnName = "identifiant")
    private Client client;
    
    @Column
    private String siren;
    
    @Column
    private String nom;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getSiren() {
        return siren;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    @Override
    public long getIdClient() {
        return client.getIdClient();
    }

    @Override
    public void setIdClient(long idClient) {
        this.client.setIdClient(idClient);
    }

    @Override
    public Set<CompteBancaire> getCompteBancaire() {
        return client.getCompteBancaire();
    }

    @Override
    public void setCompteBancaire(Set<CompteBancaire> CompteBancaire) {
        this.client.setCompteBancaire(CompteBancaire);
    }
    
    
    
    
}
