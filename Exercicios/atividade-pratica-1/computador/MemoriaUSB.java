package computador;

public class MemoriaUSB {
    public static final int DEFAULT_CAPACITY = -1;
    public String nome;
    public int capacidade = DEFAULT_CAPACITY;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }
}
