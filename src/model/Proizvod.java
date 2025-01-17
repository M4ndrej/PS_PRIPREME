/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Andrej
 */
public class Proizvod {
    
    private int sifra;
    private String naziv;
    private double cena;
    private PoreskaStopa ps;
    private Proizvodjac proizvodjac;

    public Proizvod() {
    }

    public Proizvod(int sifra, String naziv, double cena, PoreskaStopa ps, Proizvodjac proizvodjac) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cena = cena;
        this.ps = ps;
        this.proizvodjac = proizvodjac;
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

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public PoreskaStopa getPs() {
        return ps;
    }

    public void setPs(PoreskaStopa ps) {
        this.ps = ps;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

   
    

    

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
}
