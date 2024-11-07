/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import baza.DBBroker;
import java.util.ArrayList;
import java.util.List;
import model.PoreskaStopa;
import model.Profesor;
import model.Proizvod;
import model.Proizvodjac;
import model.Zvanje;

/**
 *
 * @author Andrej
 */
public class Controller {
    
    private static Controller instance;
    private List<Proizvod> proizvodi = new ArrayList<>();
    private List<Proizvodjac> proizvodjaci = new ArrayList<>();
    private List<PoreskaStopa> poreskeStope= new ArrayList<>();
    private DBBroker dbb;
    
    private Controller(){
        
        dbb = new DBBroker();
        
        Proizvodjac p1 = new Proizvodjac(1, "Proizvodjac1");
        Proizvodjac p2 = new Proizvodjac(2, "Proizvodjac1");
        proizvodjaci.add(p1);
        proizvodjaci.add(p2);
        
        PoreskaStopa ps1 = new PoreskaStopa(1,"PDV", 20);
        PoreskaStopa ps2 = new PoreskaStopa(2,"NPDV", 0);
        poreskeStope.add(ps1);
        poreskeStope.add(ps2);
        
        Proizvod pr1 = new Proizvod(1,"PR A", 100,ps2,p2);
        Proizvod pr2 = new Proizvod(2,"PR B", 200,ps1,p2);
        Proizvod pr3 = new Proizvod(3,"PR C", 300,ps2,p2);
        
        proizvodi.add(pr1);
        proizvodi.add(pr2);
        proizvodi.add(pr3);
        
    }
    
    public static Controller getInstance(){
        if(instance == null)
            instance = new Controller();
        return instance;
                
    }

    public List<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }

    public List<Proizvodjac> getProizvodjaci() {
        return proizvodjaci;
    }

    public void setProizvodjaci(List<Proizvodjac> proizvodjaci) {
        this.proizvodjaci = proizvodjaci;
    }

    public List<PoreskaStopa> getPoreskeStope() {
        return poreskeStope;
    }

    public void setPoreskeStope(List<PoreskaStopa> poreskeStope) {
        this.poreskeStope = poreskeStope;
    }

    public List<Profesor> vratiListuProfesoraIzBaze(){
        return dbb.vratiListuProfesoraIzBaze();
    }

    public void azurirajProfesoraUBazi(int id, String ime, String prezime, Zvanje zvanje) {
        
        dbb.azurirajProfesoraUBazi(id,ime,prezime,zvanje);
    }
    
    
    
}
