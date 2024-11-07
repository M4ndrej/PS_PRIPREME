/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Andrej
 */
public class Proizvodjac {
    
    private int sifra;
    private String naziv;

    public Proizvodjac() {
    }

    public Proizvodjac(int sifra, String naziv) {
        this.sifra = sifra;
        this.naziv = naziv;
    }
    
    

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
}
