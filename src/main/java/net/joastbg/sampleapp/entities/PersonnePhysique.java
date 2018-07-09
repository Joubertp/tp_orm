package net.joastbg.sampleapp.entities;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name= "PERSONNE_PHYSIQUE")
public class PersonnePhysique extends Client{
    
    @Id
    @OneToOne
    @JoinColumn(name = "CLIENT", referencedColumnName = "identifiant")
    private Client client;
    
    private String nom;
            
    private String prenom;
    
    private String date_naissance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
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
