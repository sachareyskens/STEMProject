package be.pxl.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    private int id;
    private String voornaam;
    private String naam;
    private int leeftijd;
    @ManyToOne
    private Klas klas;

    public User() {
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public Klas getKlas() {
        return klas;
    }

    public void setKlas(Klas klas) {
        this.klas = klas;
    }
}
