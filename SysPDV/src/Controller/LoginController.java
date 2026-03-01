/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Login;
import Model.User;

/**
 *
 * @author Lucas Silva
 */
public class LoginController {
    
    private Login log;
    private User usuario;
    
    public LoginController(){
        this.log = new Login();
        this.usuario = new User();
    }
    
    public boolean login(String user, String pass){
        
        this.usuario.setUser(user);
        this.usuario.setPass(pass);
        this.log.login(this.usuario);
        
        return this.usuario.isSession();
    }
}
