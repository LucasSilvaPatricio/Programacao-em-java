import banco.Conta;

import static java.lang.IO.println;

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Conta c;

    println("Entrar com numero da conta: ");
    int contaNumero = sc.nextInt();

    println("Seu nome: ");
    String nome = sc.next();

    println("Deseja inicial com um deposito inicial?(y/n)");
    char resposta = sc.next().charAt(0);

    if (resposta == 'y'){
        c = new Conta(contaNumero,nome,500);
    }else{
        c = new Conta(contaNumero, nome);
    }

    println(c);

    println("Entre com um valor de deposito: ");
    c.depositar(sc.nextDouble());

    println(c);

    println("Entre com um valor de saque: ");
    c.retirar(sc.nextDouble());

    println(c);
}
