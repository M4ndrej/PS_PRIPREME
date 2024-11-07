/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.util.*;
import model.Profesor;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Status;
import model.Zvanje;


/**
 *
 * @author Andrej
 */
public class DBBroker {
    public List<Profesor> vratiListuProfesoraIzBaze(){
        List<Profesor> lista = new ArrayList<>();
        String upit = "SELECT * FROM PROFESOR";
        try{
                    Statement st = Konekcija.getInstance().getConnection().createStatement();
                    ResultSet rs = st.executeQuery(upit);
                    while(rs.next()){
                        int id = rs.getInt("id");
                        String ime = rs.getString("ime");
                        String prezime = rs.getString("prezime");
                        Zvanje zvanje =  Zvanje.valueOf(rs.getString("zvanje"));
                        Status status = Status.valueOf(rs.getString("status"));
                        
                        Profesor p = new Profesor(id, ime, prezime, zvanje, status);
                        lista.add(p);
                    }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }

    public void azurirajProfesoraUBazi(int id, String ime, String prezime, Zvanje zvanje) {
        try {
            String upit = "UPDATE profesor\n" +
                    "SET ime = ? ,prezime = ? ,zvanje = ?\n" +
                    "WHERE id = ?";
            
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1,ime);
            ps.setString(2,prezime);
            ps.setString(3, String.valueOf(zvanje));
            ps.setInt(4,id);
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
