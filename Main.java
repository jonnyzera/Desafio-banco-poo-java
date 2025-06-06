public class Main {
    public static void main(String[] args) {
        Cliente Arthur = new Cliente();
        Arthur.setNome("Arthur");

        Conta cc = new contaCorrente(Arthur);
        cc.imprimirExtrato();

        Conta cp = new contaPoupanca(Arthur);
        cp.depositar(1000);
        cp.imprimirExtrato();

    }
}