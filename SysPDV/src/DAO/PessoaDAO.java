/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.ConexaoDB.getConexao;
import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas Silva
 */
public class PessoaDAO {

    public void cadastrar_pessoa(Pessoa pessoa) {

        Connection conn = getConexao();

        try {

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa (nome,email,identificador,tipo_de_pessoa) VALUES(?,?,?,?)");
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEmail());
            stmt.setString(3, pessoa.getCpf());
            stmt.setInt(4, pessoa.getTipo_de_pessoa());

            stmt.executeUpdate();

            stmt = conn.prepareStatement("SELECT id FROM pessoa WHERE identificador=?");
            stmt.setString(1, pessoa.getCpf());
            ResultSet rs = stmt.executeQuery();

            int id = 0;

            while (rs.next()) {
                id = rs.getInt("id");
            }

            stmt = conn.prepareStatement("INSERT INTO contato (id_pessoa,tel) VALUES(?,?)");
            stmt.setInt(1, id);
            stmt.setString(2, pessoa.getTel1());
            stmt.executeUpdate();

            stmt = conn.prepareStatement("INSERT INTO contato (id_pessoa,tel) VALUES(?,?)");
            stmt.setInt(1, id);
            stmt.setString(2, pessoa.getTel2());
            stmt.executeUpdate();

            stmt = conn.prepareStatement("INSERT INTO endereco (id_pessoa,cep,estado,cidade,bairro,rua,numero) VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, id);
            stmt.setString(2, pessoa.getCep());
            stmt.setString(3, pessoa.getEstado());
            stmt.setString(4, pessoa.getCidade());
            stmt.setString(5, pessoa.getBairro());
            stmt.setString(6, pessoa.getRua());
            stmt.setInt(7, pessoa.getNumero());

            stmt.executeUpdate();
            
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
