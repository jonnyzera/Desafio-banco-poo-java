public interface iConta {
    // Métodos públicos
    void sacar(double valor); // Assinaturas de Métodos

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}