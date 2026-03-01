import banco.Conta;

import static java.lang.IO.println;

public void imprimir(Conta c){
    println("Dados da conta: ");
    println("Conta: "+c.getNumeroConta()+" Nome: "+c.getNomeUsuario()+" Valor: "+c.getValorNaConta()+"\n");
}

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    println("Entrar com numero da conta: ");
    int contaNumero = sc.nextInt();

    println("Seu nome: ");
    String nome = sc.next();

    println("Deseja inicial com um deposito inicial?(y/n)");
    String resposta = sc.next();

    Conta c;
    if (resposta.toLowerCase().equals("y")){
        c = new Conta(contaNumero,nome,500);
    }else{
        c = new Conta(contaNumero, nome);
    }

    imprimir(c);

    println("Entre com um valor de deposito: ");
    c.depositar(sc.nextDouble());

    imprimir(c);

    println("Entre com um valor de saque: ");
    c.retirar(sc.nextDouble());

    imprimir(c);
}
