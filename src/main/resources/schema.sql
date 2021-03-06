CREATE SEQUENCE CLIENT_SEQUENCE START WITH 20 INCREMENT BY 1;
CREATE SEQUENCE ASSURANCE_SEQUENCE START WITH 20 INCREMENT BY 1;


create TABLE ASSURANCE_AUTO(
    numero_assurance INTEGER,
    immantruculation VARCHAR (50),
    bonus_malus VARCHAR (50),
    PRIMARY KEY (numero_assurance),
    FOREIGN KEY (numero_assurance) REFERENCES ASSURANCE(numero_assurance)
);

create TABLE ASSURANCE_HABITATION(
    numero_assurance INTEGER,
    adresse_assuree VARCHAR (50),
    valeur_couverture INTEGER,
    PRIMARY KEY (numero_assurance),
    FOREIGN KEY (numero_assurance) REFERENCES ASSURANCE(numero_assurance)
);

create TABLE ASSURANCE(
    numero_assurance INTEGER GENERATED BY DEFAULT AS IDENTITY (start with 1),
    date_souscription VARCHAR (50),
    date_anniversaire VARCHAR (50),
    date_prelevement VARCHAR (50),
    id_echeance INTEGER,
    identifiant INTEGER,
    PRIMARY KEY (numero_assurance),
    FOREIGN KEY (id_Echeance) REFERENCES ECHEANCE(id_Echeance),
    FOREIGN KEY (identifiant) REFERENCES CLIENT(identifiant)
);

create TABLE ECHEANCE(
    id_echeance INTEGER GENERATED BY DEFAULT AS IDENTITY (start with 1),
    prix INTEGER,
    date_emission VARCHAR (50),
    date_paiment VARCHAR (50),
    date_emission_facture VARCHAR (50),    
    PRIMARY KEY (id_Echeance)
);

create TABLE CLIENT(
    identifiant INTEGER GENERATED BY DEFAULT AS IDENTITY (start with 1),  
    principale_compte INTEGER,
    PRIMARY KEY (identifiant)
    FOREIGN KEY (principale_compte) REFERENCES COMPTE_BANCAIRE(id_compte)
);

create TABLE COMPTE_BANCAIRE(
    id_compte INTEGER GENERATED BY DEFAULT AS IDENTITY (start with 1),
    iban VARCHAR (50),  
    bic VARCHAR (50),    
    identifiant INTEGER,
    PRIMARY KEY (id_compte),
    FOREIGN KEY (identifiant) REFERENCES CLIENT(identifiant)
);

create TABLE CONTACT(
    id_contact INTEGER GENERATED BY DEFAULT AS IDENTITY (start with 1),
    type_contact VARCHAR (50),  
    valeur INTEGER,
    identifiant INTEGER,
    PRIMARY KEY (id_contact),
    FOREIGN KEY (identifiant) REFERENCES CLIENT(identifiant)
);

CREATE TABLE PERSONNE_MORALE(
    identifiant INTEGER,
    siren VARCHAR (50),
    nom VARCHAR (50),
    PRIMARY KEY (identifiant),
    FOREIGN KEY (identifiant) REFERENCES CLIENT(identifiant)
);

CREATE TABLE PERSONNE_PHYSIQUE(
    identifiant INTEGER,
    nom VARCHAR (50),
    prenom VARCHAR (50),
    date_naissance VARCHAR (50),
    PRIMARY KEY (identifiant),
    FOREIGN KEY (identifiant) REFERENCES CLIENT(identifiant)
);



-- insert into CLIENT values(0);
-- insert into CLIENT values(1);
-- insert into CLIENT values(2);
-- insert into CLIENT values(3);
-- 
-- insert into COMPTE_CLIENT values(0,'12345');
-- insert into COMPTE_CLIENT values(0,'45821','');
-- insert into COMPTE_CLIENT values(0,'78413','');
-- insert into COMPTE_CLIENT values(0,'86915','');
-- 
-- insert into COMPTE_BANCAIRE values('12345','Roitelet','dfdf');
-- insert into COMPTE_BANCAIRE values('45821','Dupont','ffdfd');
-- insert into COMPTE_BANCAIRE values('78413','Duvivier','ffdfsx');
-- insert into COMPTE_BANCAIRE values('86915','Rifflet','opojjkl');
