package mamiferos;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSom();

    public void mostratInfo() {
        System.out.println("-------");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
