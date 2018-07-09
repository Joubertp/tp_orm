package net.joastbg.sampleapp.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name= "CLIENT")
public class Client{   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long idClient;

    @OneToMany
    @JoinColumn(name = "COMPTE_BANCAIRE", referencedColumnName = "id_compte")
    private Set<CompteBancaire> CompteBancaire;

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public Set<CompteBancaire> getCompteBancaire() {
        return CompteBancaire;
    }

    public void setCompteBancaire(Set<CompteBancaire> CompteBancaire) {
        this.CompteBancaire = CompteBancaire;
    }

 
       
    
}


