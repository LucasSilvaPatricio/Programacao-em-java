/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Silva
 */
public class ProdutoController {

    private final Produto produtoModel;
    private final ProdutoDAO produtoDao;

    public ProdutoController() {
        this.produtoModel = new Produto();
        this.produtoDao = new ProdutoDAO();
    }
    
    public void cadastrar_produto(String cor, String modelo, String imei, String codigo_barras, String fornecedor, String gb_ram, String armazenamento, String valor_unitario, String valor_revenda, String quantidade) {
        if (cor.equals("") || modelo.equals("") || imei.equals("") || codigo_barras.equals("") || fornecedor.equals("") || gb_ram.equals("") || armazenamento.equals("") || valor_unitario.equals("") || valor_revenda.equals("") || quantidade.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", null, JOptionPane.WARNING_MESSAGE);
        }else{
            this.produtoModel.setCor(cor);
            this.produtoModel.setModelo(modelo);
            this.produtoModel.setImei(imei);
            this.produtoModel.setCodigo_barras(codigo_barras);
            this.produtoModel.setFornecedor(fornecedor);
            
            this.produtoModel.setGb_ram(Integer.parseInt(gb_ram));
            this.produtoModel.setArmazenamento(Integer.parseInt(armazenamento));
            
            this.produtoModel.setValor_unitario(Double.parseDouble(valor_unitario));
            this.produtoModel.setValor_revenda(Double.parseDouble(valor_revenda));
            this.produtoModel.setQuantidade(Integer.parseInt(quantidade));
            
            this.produtoDao.cadastrar_produto(produtoModel);
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
            
        }
    }

//    public static void main(String[]args){
//        new ProdutoController().cadastrar_produto("","","","","5","6","7","8","9");
//    }
}
