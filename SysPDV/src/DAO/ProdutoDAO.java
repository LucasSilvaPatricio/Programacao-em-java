/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.ConexaoDB.getConexao;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas Silva
 */
public class ProdutoDAO {
    
    public void cadastrar_produto(Produto produto){
        
        Connection conn = getConexao();

        try {

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO produto (imei,cor,armazenamento,ram,valor_unitario,modelo,fornecedor,codigo_barras,valor_revenda,quantidade) VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, produto.getImei());
            stmt.setString(2, produto.getCor());
            stmt.setInt(3, produto.getArmazenamento());
            stmt.setInt(4, produto.getGb_ram());
            stmt.setDouble(5, produto.getValor_unitario());
            stmt.setString(6, produto.getModelo());
            stmt.setString(7, produto.getFornecedor());
            stmt.setString(8, produto.getCodigo_barras());
            stmt.setDouble(9, produto.getValor_revenda());
            stmt.setInt(10, produto.getQuantidade());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
