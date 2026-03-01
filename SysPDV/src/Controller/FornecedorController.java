/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FornecedorDAO;
import java.util.ArrayList;
//import Model.Fornecedor;

/**
 *
 * @author Lucas Silva
 */
public class FornecedorController {
    
    //private final Fornecedor fornecedorModel;
    //private final FornecedorDAO fornecedorDao;
    
    public FornecedorController(){
        //this.fornecedorModel = new Fornecedor();
        //this.fornecedorDao = new FornecedorDAO();
    }
    
    public String[] listar_fornecedores(){
        return new FornecedorDAO().listar_fornecedores();
    }
    
    public ArrayList<String[]> buscar_amostra(){
            return new FornecedorDAO().buscar_amostra();
            
    }

}
