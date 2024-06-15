import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("Gabriel Ribeiro");

        Conta cc = new ContaCorrente(cli);
        Conta poupanca = new ContaPoupanca(cli);

        cc.depositar(200);
        cc.sacar(50);
        cc.transferir(50, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}