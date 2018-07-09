package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COMPTE_BANCAIRE")
public class CompteBancaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_compte")
    private int id_compte;
    
    @Column
    private String iban;
    
    @Column
    private String bic;
    
    @ManyToOne
    @JoinColumn(name = "CLIENT", referencedColumnName = "idClient")
    private Client proprietaire;

    public CompteBancaire(){
        
    }
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }


    
    

}
