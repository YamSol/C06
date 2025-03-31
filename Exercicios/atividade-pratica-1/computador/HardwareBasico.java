package computador;

public class HardwareBasico {
    public static final float DEFAULT_CAPACITY = -1.0f;
    public String nome;
    public float capacidade = DEFAULT_CAPACITY;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }
}
