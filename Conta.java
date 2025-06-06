// Super Classe
public abstract class Conta implements iConta {

    // Gerar Const "Agencia Padrão"
    private static final int AGENCIA_PADRAO = 1;

    // Número sequencial Incremento
    private static int SEQUENCIAL = 1;

    // Atributos agencia, numero e saldo;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected String banco;

    // Construtor Conta()
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    // Chamando métodos da Interface: Sacar(), Depositar(), Transferir()
    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Getters e Setters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método comum: contaCorrente x contaPoupanca
    protected void imprimirInfoComuns() {
        System.out.println(String.format("Banco: %d", this.banco));
        System.out.println(String.format("Títular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
    }
}
