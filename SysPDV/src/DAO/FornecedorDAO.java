/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.ConexaoDB.getConexao;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas Silva
 */
public class FornecedorDAO {

    public String[] listar_fornecedores() {

        String[] fornecedor = new String[0];

        try {
            PreparedStatement stmt = getConexao().prepareStatement("SELECT nome FROM pessoa WHERE tipo_de_pessoa=1"); //WHERE tipo_de_pessoa=1

            ResultSet rs = stmt.executeQuery();

            rs.last(); // move para ultima linha

            fornecedor = new String[rs.getRow()]; // cria vetor com o tamanho da consulta

            rs.beforeFirst();// move de volta para o primeiro resultado

            int count = 0;

            while (rs.next()) {
                fornecedor[count] = rs.getString("nome");
                count++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fornecedor;
    }

    
     // busca amostra de 10 fornecedores na base
    public ArrayList<String[]> buscar_amostra() {

        Connection conn = getConexao();
        ArrayList<String[]> clientes = new ArrayList<String[]>();

        try {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pessoa WHERE tipo_de_pessoa=1 ORDER BY id DESC LIMIT 10");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                clientes.add(new String[]{Integer.toString(rs.getInt("id")), rs.getString("nome"), rs.getString("identificador"), rs.getString("email")});
            }
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }
//    public static void main(String[]args){
//        String fornecedores[] = new FornecedorDAO().listar_fornecedores();
//        for (String fornecedore : fornecedores) {
//            System.out.println(fornecedore);
//        }
//    }
}
