/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Lucas Silva
 */
import static DAO.ConexaoDB.getConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

    public ArrayList<String[]> busca_cliente(String id) {

        Connection conn = getConexao();

        ArrayList<String[]> clientes = new ArrayList<String[]>();

        try {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pessoa WHERE nome LIKE ? or identificador LIKE ? LIMIT 10");
            stmt.setString(1, "%"+id+"%");
            stmt.setString(2, "%"+id+"%");
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                clientes.add(new String[]{rs.getString("id"),rs.getString("nome"),rs.getString("identificador"),rs.getString("email"),"tel1","tel2"});
            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    // busca amostra de 5 clientes na base
    public ArrayList<String[]> buscar_amostra() {

        Connection conn = getConexao();
        ArrayList<String[]> clientes = new ArrayList<String[]>();

        try {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pessoa WHERE tipo_de_pessoa=0 ORDER BY id DESC LIMIT 10");
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

    // função de teste
    //    public static void main(String[]args){
    //        ArrayList<String[]> clientes = new ClienteDAO().buscar_amostra();
    //        System.out.println(clientes.get(0));
    //    };
}
