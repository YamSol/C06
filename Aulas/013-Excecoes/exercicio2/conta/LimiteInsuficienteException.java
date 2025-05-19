package exercicio2.conta;

public class LimiteInsuficienteException extends Exception {
    public LimiteInsuficienteException() {
        super("Limite insuficiente");
    }
}
