package banco;

public class Conta {
    private int numeroConta;
    private String nomeUsuario;
    private double valorNaConta;
    private final double TAXA = 5.0;

    public Conta(int numeroConta, String nomeUsuario){
        this.numeroConta = numeroConta;
        this.nomeUsuario = nomeUsuario;
    }

    public Conta(int numeroConta, String nomeUsuario, double valorNaConta){
        this.numeroConta = numeroConta;
        this.nomeUsuario = nomeUsuario;
        this.valorNaConta = valorNaConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeUsuario(){
        return this.nomeUsuario;
    }

    public double getValorNaConta(){
        return this.valorNaConta;
    }

    public void depositar(double valor){
        this.valorNaConta += valor;
    }

    public void retirar(double valor){
        this.valorNaConta -= valor + TAXA;
    }

}
