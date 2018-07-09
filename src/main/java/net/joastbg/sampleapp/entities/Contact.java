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
@Table( name= "CONTACT")
public class Contact {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_compte")
    private int idContact;
    
    @Column
    private String type_contact;
    
    @Column
    private int valeur;
    
    @ManyToOne
    @JoinColumn(name = "CLIENT", referencedColumnName = "identifiant")
    private Client client;

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getType_contact() {
        return type_contact;
    }

    public void setType_contact(String type_contact) {
        this.type_contact = type_contact;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
}
