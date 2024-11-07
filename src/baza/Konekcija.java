/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.sql.*;

public class Konekcija {
    
    private static Konekcija instance;
    private Connection connection;

    private Konekcija() {
        try{
            String url="jdbc:mysql://localhost:3306/PS_1_KLK_2019_G1";
            connection = DriverManager.getConnection(url,"root","");
            connection.setAutoCommit(false);
        }catch(Exception e){
            
        }
      
        
    }
    public static Konekcija getInstance(){
        if(instance == null){
            instance = new Konekcija();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    
    
    
}
