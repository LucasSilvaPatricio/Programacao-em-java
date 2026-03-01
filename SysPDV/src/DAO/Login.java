/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.ConexaoDB.getConexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.User;
/**
 *
 * @author Lucas Silva
 */
public class Login {
    

    private String username;
    private String pass;
    
    public Login(){
       
    }  
    
    public void login(User u_model){
        
        this.username = u_model.getUser();
        this.pass = u_model.getPass();

        try {
            
            PreparedStatement stmt = getConexao().prepareStatement("SELECT * FROM admin WHERE usuario=? AND senha=?");
            stmt.setString(1, this.username);
            stmt.setString(2, this.pass);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                u_model.setName(rs.getString("nome"));
                u_model.setSession(rs.first());
                
            }  
           
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
   
         
    }

}
