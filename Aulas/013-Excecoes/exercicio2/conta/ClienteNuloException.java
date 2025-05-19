package exercicio2.conta;

public class ClienteNuloException extends Exception {
    public ClienteNuloException() {
        super("Erro ao utilizar cliente nulo");
    }
}
