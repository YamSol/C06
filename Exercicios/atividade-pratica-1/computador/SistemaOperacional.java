package computador;

public class SistemaOperacional {
    public static final int DEFAULT_TYPE = -1;
    public String nome;
    public int tipo = DEFAULT_TYPE;

    public SistemaOperacional() {

    }

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
