/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ClienteDAO;
import Model.Pessoa;
import DAO.PessoaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Silva
 */
public class PessoaController {

    private final Pessoa pessoaModel;
    private final PessoaDAO pessoaDao;

    public PessoaController() {
        this.pessoaModel = new Pessoa();
        this.pessoaDao = new PessoaDAO();
    }

    public void cadastrar_pessoa(String nome, String cpf, String email, String tel1, String tel2, String cep, String estado, String cidade, String bairro, String rua, String numero, int tipo_de_pessoa) {

        if (nome.equals("") || cpf.equals("") || email.equals("") || tel1.equals("") || tel2.equals("") || cep.equals("") || estado.equals("") || cidade.equals("") || bairro.equals("") || rua.equals("") || numero.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
        } else {
            //
            this.pessoaModel.setNome(nome);
            this.pessoaModel.setCpf(cpf);

            // informações de contato
            this.pessoaModel.setEmail(email);
            this.pessoaModel.setTel1(tel1);
            this.pessoaModel.setTel2(tel2);

            // informações de endereço
            this.pessoaModel.setCep(cep);
            this.pessoaModel.setEstado(estado);
            this.pessoaModel.setCidade(cidade);
            this.pessoaModel.setBairro(bairro);
            this.pessoaModel.setRua(rua);
            this.pessoaModel.setNumero(Integer.parseInt(numero));
            this.pessoaModel.setTipo_de_pessoa(tipo_de_pessoa);

            this.pessoaDao.cadastrar_pessoa(this.pessoaModel);

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");

        }
        
    }
    
    public ArrayList<String[]> buscar_amostra(){
            return new ClienteDAO().buscar_amostra();         
    }
    
    public ArrayList<String[]> busca_cliente(String id){
        return new ClienteDAO().busca_cliente(id);
    }
}
