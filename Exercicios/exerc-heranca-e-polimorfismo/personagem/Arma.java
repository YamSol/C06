package personagem;

public class Arma {
    private String nome;
    private int dano;
    private int durabilidade;

    public Arma(String nome, int dano, int durabilidade) {
        this.nome = nome.replace("%","");
        this.dano = dano;
        this.durabilidade = durabilidade;
    }

    public String toString() {
        return "Arma: " + nome + "\n" +
        "Dano: " + dano + "\n" +
        "Durabilidade: " + durabilidade;
    }


    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
