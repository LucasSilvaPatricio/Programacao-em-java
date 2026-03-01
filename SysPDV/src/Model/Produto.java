/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lucas Silva
 */
public class Produto {
    
    private String imei;
    private String cor;
    private String modelo;
    private String fornecedor;
    private String codigo_barras;
    
    private int gb_ram;
    private int armazenamento;
    private int quantidade; 
    
    private double valor_unitario;
    private double valor_revenda;

    /**
     * @return the imei
     */
    public String getImei() {
        return imei;
    }

    /**
     * @param imei the imei to set
     */
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the codigo_barras
     */
    public String getCodigo_barras() {
        return codigo_barras;
    }

    /**
     * @param codigo_barras the codigo_barras to set
     */
    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    /**
     * @return the gb_ram
     */
    public int getGb_ram() {
        return gb_ram;
    }

    /**
     * @param gb_ram the gb_ram to set
     */
    public void setGb_ram(int gb_ram) {
        this.gb_ram = gb_ram;
    }

    /**
     * @return the armazenamento
     */
    public int getArmazenamento() {
        return armazenamento;
    }

    /**
     * @param armazenamento the armazenamento to set
     */
    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    /**
     * @return the valor_unitario
     */
    public double getValor_unitario() {
        return valor_unitario;
    }

    /**
     * @param valor_unitario the valor_unitario to set
     */
    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    /**
     * @return the valor_revenda
     */
    public double getValor_revenda() {
        return valor_revenda;
    }

    /**
     * @param valor_revenda the valor_revenda to set
     */
    public void setValor_revenda(double valor_revenda) {
        this.valor_revenda = valor_revenda;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
